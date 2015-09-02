package goldenapple.enchbaubles.enchant;

public class EnchantmentSaturation extends EnchantmentBauble {
    public EnchantmentSaturation(int id) {
        super(id, 3, EnchantmentBauble.belt);
        this.setName("saturation");
    }

    @Override
    public int getMinEnchantability(int lvl) {
        return 1 + 8 * (lvl - 1);
    }

    @Override
    public int getMaxEnchantability(int lvl) {
        return this.getMinEnchantability(lvl) + 20;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}
