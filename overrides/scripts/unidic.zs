
mods.unidict.removalByKind.get("Crafting").remove("plate");
mods.unidict.removalByKind.get("Crafting").remove("rod");
mods.unidict.removalByKind.get("Crafting").remove("stick");
mods.unidict.removalByKind.get("Crafting").remove("gear");

recipes.remove(<ore:plateAluminum>);
recipes.remove(<ore:plateBronze>);
recipes.remove(<ore:plateConstantan>);
recipes.remove(<ore:plateCopper>);
recipes.remove(<ore:plateElectrum>);
recipes.remove(<ore:plateGold>);
recipes.remove(<ore:plateInvar>);
recipes.remove(<ore:plateIron>);
recipes.remove(<ore:plateLead>);
recipes.remove(<ore:plateNickel>);
recipes.remove(<ore:platePlatinum>);
recipes.remove(<ore:plateSignalum>);
recipes.remove(<ore:plateSilver>);
recipes.remove(<ore:plateSteel>);
recipes.remove(<ore:plateTin>);
val itemstoRemoves =
[
    "enderio:gear_better_save_than_sorry",
    "enderio:gear_just_to_be_sure",
    "enderio:gear_ae2_messes_things_up",
    "enderio:gear_wood",
    "thermalfoundation:material_59",
    "thermalfoundation:material_60",
    "betterwithmods:items/material/material.gear",
    "betterwithmods:items/material/material.redstone_latch",
    "minecraft:brick_block",
    "mystgears:recipe_gear_stone",
    "minecraft:hopper",
    "extrautils2:shortcut_hopper",
    "rustichromia:plate_wood",
    "rustichromia:plate_wood_early",
    "minecraft:bucket",
    "naturesaura:gold_fiber",
    "betterwithmods:blocks/mech/gearbox",
    "mysticalmechanics:mergebox_frame",
    "naturesaura:wood_stand",
    "unidict:ingotbrass_x3_size4",
    "clockworkphase:clockwork_-151758902",
    "abyssalcraft:necronomicon"
] as string[];

for item in itemstoRemoves {
	recipes.removeByRecipeName(item);
}
