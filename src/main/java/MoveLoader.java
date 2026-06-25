import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.InputStreamReader;

public class MoveLoader {

    public static List<MoveData> load() {
        Gson gson = new Gson();
        
        InputStreamReader reader = new InputStreamReader(
            MoveLoader.class.getResourceAsStream("/moves.json")
        );

        MoveData[] moves = gson.fromJson(reader, MoveData[].class);

        // Ensure the simple `move` field is populated from the nested `name` object when present
        if (moves != null) {
            for (MoveData m : moves) {
                if ((m.move == null || m.move.trim().isEmpty()) && m.name != null && m.name.english != null) {
                    m.move = m.name.english;
                }
            }
        }

        return Arrays.asList(moves);
    }

    public static MoveData[] loadAll() {
        List<MoveData> moves = load();
        return moves.toArray(new MoveData[0]);
    }
}
