package com.buuz135.functionalstorage.item;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.buuz135.functionalstorage.block.tile.StorageControllerTile;
import com.hrznstudio.titanium.item.BasicItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelReader;

public class FSItem extends BasicItem {
    public FSItem(Properties properties) {
        super(properties);
        setItemGroup(FunctionalStorage.TAB);
    }

    @Override
    public boolean doesSneakBypassUse(ItemStack stack, LevelReader level, BlockPos pos, Player player) {
        return level.getBlockEntity(pos) instanceof StorageControllerTile<?>
                && stack.is(FunctionalStorage.VOID_UPGRADE);
    }
}
