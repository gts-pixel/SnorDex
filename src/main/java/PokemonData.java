public class PokemonData {
    public int id, abilityGen;
    public String name, primaryTypes, secondaryTypes, eggGroup, genderRatio, catchRate, baseExp;
    public int total, hp, atk, def, spA, spD, spe;
    public String ability, height, weight, hiddenAbility, species, abilityDesc;
    public String imageUrl;

    public PokemonData(int id, String name, String primaryTypes, String secondaryTypes, String eggGroup, String genderRatio, String catchRate, String baseExp, String ability, String height, String weight, String hiddenAbility, String species,
                          int total, int hp, int atk, int def, int spA, int spD, int spe, String imageUrl, int abilityGen, String abilityDesc) {
        this.id = id;
        this.name = name;
        this.primaryTypes = primaryTypes;
        this.secondaryTypes = secondaryTypes;
        this.hp = hp; this.atk = atk; this.def = def;
        this.spA = spA; this.spD = spD; this.spe = spe;
        this.total = hp + atk + def + spA + spD + spe;
        this.eggGroup = eggGroup; this.species = species;
        this.height = height; this.weight = weight;
        this.weight = weight; this.hiddenAbility = hiddenAbility;
        this.genderRatio = genderRatio; this.catchRate = catchRate;
        this.baseExp = baseExp; this.ability = ability;
        this.imageUrl = imageUrl; this.abilityGen = abilityGen; this.abilityDesc = abilityDesc;
    }
}