package mtrnord.StarTreckMod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public class ItemShovelStarTreckMod extends ItemToolStarTreckMod
{
    /** an array of the blocks this spade is effective against */
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public ItemShovelStarTreckMod(int par1, EnumToolMaterialStarTreck par2EnumToolMaterial)
    {
        super(par1, 1.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
}
