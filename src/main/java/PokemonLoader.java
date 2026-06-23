import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class PokemonLoader {

    public static PokemonData[] loadAll() {
        try (InputStream is = PokemonLoader.class.getResourceAsStream("/pokemon.json");
             Reader reader = new InputStreamReader(is)) {

            Type listType = new TypeToken<List<PokemonData>>(){}.getType();
            List<PokemonData> list = new Gson().fromJson(reader, listType);

            // hitung total tiap pokemon
            for (PokemonData p : list) {
                p.total = p.hp + p.atk + p.def + p.spA + p.spD + p.spe;
            }

            return list.toArray(new PokemonData[0]);

        } catch (Exception e) {
            e.printStackTrace();
            return new PokemonData[0];
        }
    }
}