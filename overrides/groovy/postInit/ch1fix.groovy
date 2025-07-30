import mods.betterwithaddons.transmutation
import mods.betterwithmods.mill_stone
import mods.naturesaura.altar
import mods.embers.mixer

def remove = [
    item('mystgears:gear_wood'),
    item('esuperbotany:xtchestplate'),
    item('esuperbotany:xthelmet'),
    item('esuperbotany:bhsfuniform'),
    item('esuperbotany:xtleggings'),
    item('esuperbotany:xtboots'),
    item('appliedenergistics2:material', 40),
    item('minecraft:clock'),
    item('embers:stamp_rod_raw'),
    item('soot:stamp_nugget_raw'),
    item('rustichromia:windmill'),
    item('rustichromia:windmill_big'),
    item('rustichromia:windmill_blade'),
    item('betterwithmods:material', 11),
    item('minecraft:glass_bottle'),
    item('aroma1997sdimension:miningmultitool')
    ]
for(part in remove) {
    crafting.removeByOutput(part)
}
crafting.removeByOutput([item('clockworkphase:brass_ingot')*3])
mods.naturesaura.ritual.removeByOutput(item('naturesaura:nature_altar'))
crafting.addShaped("hopper",item('minecraft:hopper'),
[[item('minefantasyreforged:chain_mesh').withNbt(['mf_custom_materials': ['main_material': 'iron']]),null,item('minefantasyreforged:chain_mesh').withNbt(['mf_custom_materials': ['main_material': 'iron']])]
,[item('minefantasyreforged:chain_mesh').withNbt(['mf_custom_materials': ['main_material': 'iron']]),ore('chestWood'),item('minefantasyreforged:chain_mesh').withNbt(['mf_custom_materials': ['main_material': 'iron']])],
[null,item('minefantasyreforged:chain_mesh').withNbt(['mf_custom_materials': ['main_material': 'iron']]),null]])
mods.embers.stamper.recipeBuilder()
    .input(item('minefantasyreforged:timber').withNbt(['mf_custom_materials': ['main_material': 'refined_wood']]))
    .stamp(item('embers:stamp_plate'))
    .output(item('rustichromia:plate_wood'))
    .register()
crafting.addShaped(item('betterwithmods:wooden_gearbox'), [[ore('plankWood'),ore('gearWood'),ore('plankWood')],[item('betterwithmods:material', 33),item('betterwithmods:material', 34),item('betterwithmods:material', 33)],[ore('plankWood'),ore('gearWood'),ore('plankWood')]])
crafting.addShaped("windmill_blade",item('betterwithmods:material', 11),
[[ore('fabricHemp'),ore('fabricHemp'),ore('fabricHemp')]
,[ore('fabricHemp'),ore('hideScoured'),ore('fabricHemp')],
[ore('slabWood'),ore('slabWood'),ore('slabWood')]])

mods.betterwithmods.mill_stone.recipeBuilder()
    .input(item('naturesaura:gold_leaf'))
    .output(item('naturesaura:gold_powder') * 2)
    .register()

mods.naturesaura.altar.recipeBuilder()
    .input(item('naturesaura:gold_leaf'))
    .output(item('naturesaura:gold_powder') * 16)
    .catalyst(item('naturesaura:crushing_catalyst'))
    .aura(10)
    .time(20)
    .register()
crafting.addShaped("enchanter",item('minecraft:enchanting_table'),
    [[null,item('minecraft:book'),null],
    [item('avaritia:resource'),item('prefab:block_compressed_obsidian'),item('avaritia:resource')]
    ,[item('prefab:block_compressed_obsidian'),item('prefab:block_compressed_obsidian'),item('prefab:block_compressed_obsidian')]]
);

mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('rustichromia:assembler2'))
    .matrix([[item('solar:infused_silver'), item('betterwithmods:material', 48), item('solar:infused_silver')],
            [item('betterwithmods:material', 48), item('rustichromia:assembler1'), item('betterwithmods:material', 48)],
            [item('solar:infused_silver'), item('betterwithmods:material', 48), item('solar:infused_silver')]])
    .spirits(3)
    .register()
mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('mysticalmechanics:mergebox_frame'))
    .matrix([[item('solar:infused_gold'), item('solar:infused_gold'), item('solar:infused_gold')],
            [item('betterwithmods:steel_axle'), item('rustichromia:assembler2'), item('betterwithmods:steel_axle')],
            [item('solar:infused_gold'), item('betterwithmods:steel_axle'), item('solar:infused_gold')]])
    .spirits(8)
    .register()
mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('embers:mixer'))
    .matrix([[item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']]), item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']]), item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']])],
            [item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']]), item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'encrusted']]), item('minefantasyreforged:plate').withNbt(['mf_custom_materials': ['main_material': 'iron']])],
            [item('embers:block_caminite_brick'),item('mysticalmechanics:mergebox_frame'), item('embers:block_caminite_brick')]])
    .spirits(8)
    .register()
mods.embers.mixer.recipeBuilder()
    .fluidInput(fluid('gold') * 72, fluid('silver') * 72)
    .fluidOutput(fluid('electrum') * 144)
    .register()
mods.embers.mixer.recipeBuilder()
    .fluidInput(fluid('tin') * 36, fluid('copper') * 108)
    .fluidOutput(fluid('bronze') * 144)
    .register()
mods.embers.mixer.recipeBuilder()
    .fluidInput(fluid('zinc') * 36, fluid('copper') * 108)
    .fluidOutput(fluid('brass') * 144)
    .register()
mods.embers.stamper.recipeBuilder()
    .stamp(item('embers:stamp_bar'))
    .fluidInput(fluid('zinc') * 144)
    .output(item('qmd:ingot', 7))
    .register()
mods.embers.stamper.recipeBuilder()
    .stamp(item('embers:stamp_bar'))
    .fluidInput(fluid('brass') * 144)
    .output(item('clockworkphase:brass_ingot'))
    .register()
mods.naturesaura.ritual.recipeBuilder()
    .name('alter')
    .input(item('naturesaura:token_joy'),item('naturesaura:token_fear'),item('naturesaura:token_anger'),item('naturesaura:token_sorrow'),item('solar:sunburnt', 9),item('solar:sunburnt', 1),item('clockworkphase:brass_ingot'),item('naturesaura:gold_leaf'))
    .output(item('naturesaura:nature_altar'))
    .time(100)
    .sapling(item('betterwithaddons:sapling_mulberry'))
    .register()
