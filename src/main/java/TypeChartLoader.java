import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TypeChartLoader {
    private Map<String, TypeData> typeChart;

    public TypeChartLoader(Map<String, TypeData> typeChart) {
        this.typeChart = typeChart;
    }

    public Map<String, TypeData> getTypeChart() {
        return typeChart;
    }

    public static TypeChartLoader load() {

        try {

            Gson gson = new Gson();

            Type type = new TypeToken<List<Map<String, TypeData>>>(){}.getType();

            try (InputStream is = TypeChartLoader.class.getResourceAsStream("/TypeChart.json");
                 Reader reader = new InputStreamReader(is)) {

                List<Map<String, TypeData>> entries = gson.fromJson(reader, type);
                Map<String, TypeData> chart = new LinkedHashMap<>();
                for (Map<String, TypeData> entry : entries) {
                    for (Map.Entry<String, TypeData> item : entry.entrySet()) {
                        chart.put(item.getKey(), item.getValue());
                    }
                }
                return new TypeChartLoader(chart);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public double getMultiplier(
        String defendType,
        String attackType) {

    TypeData data = typeChart.get(defendType);

    if (data.immuneTo.contains(attackType))
        return 0.0;

    if (data.weakTo.contains(attackType))
        return 2.0;

    if (data.resistTo.contains(attackType))
        return 0.5;

    return 1.0;
    }

    public double getCombinedMultiplier(String primaryTypes, String secondaryTypes, String attackType) {
        double multiplier = getMultiplier(primaryTypes, attackType);
        if (secondaryTypes == null || secondaryTypes.isEmpty()) {
            return multiplier;
        }
        return multiplier * getMultiplier(secondaryTypes, attackType);
    }

    public static TypeChartLoader loadFromJson(String resourceName) {
        if (resourceName == null || resourceName.isBlank()) {
            resourceName = "TypeChart.json";
        }

        try {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Map<String, TypeData>>>(){}.getType();

            InputStream is = TypeChartLoader.class.getResourceAsStream("/" + resourceName);
            if (is == null && !resourceName.equals("TypeChart.json")) {
                is = TypeChartLoader.class.getResourceAsStream("/TypeChart.json");
            }
            if (is == null) {
                throw new IllegalStateException("Resource not found: " + resourceName);
            }

            try (Reader reader = new InputStreamReader(is)) {
                List<Map<String, TypeData>> entries = gson.fromJson(reader, type);
                Map<String, TypeData> chart = new LinkedHashMap<>();
                for (Map<String, TypeData> entry : entries) {
                    for (Map.Entry<String, TypeData> item : entry.entrySet()) {
                        chart.put(item.getKey(), item.getValue());
                    }
                }
                return new TypeChartLoader(chart);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
