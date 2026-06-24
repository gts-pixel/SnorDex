public class PokemonData {
    public int id, abilityGen;
    public String name, types, spesies, eggGroup, genderRatio, catchRate, baseExp;
    public int total, hp, atk, def, spA, spD, spe;
    public String ability, height, weight, hiddenAbility;

    public PokemonData(int id, String name, String types,
                          int total, int hp, int atk, int def, int spA, int spD, int spe) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.hp = hp; this.atk = atk; this.def = def;
        this.spA = spA; this.spD = spD; this.spe = spe;
        this.total = hp + atk + def + spA + spD + spe;
    }
}