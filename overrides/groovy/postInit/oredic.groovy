// priority 999
import mods.minecraft.ore_dictionary
    def remove = [
        item('dust:duststone'),
        item('dust:duststone',1),
        item('dust:duststone',2),
        item('dust:duststone',3),
        item('dust:duststone',4),
        item('dust:duststone',5),
        item('dust:duststone',6),
        item('dust:duststone',7)
    ]
for(part in remove) {
    ore_dict.add("dstone", part)
}
def ref = [
    item('dust:pedestal_stone'),
    item('dust:pedestal_red'),
    item('dust:pedestal_blue'),
    item('dust:pedestal_yellow'),
    item('dust:pedestal_purple'),
    item('dust:pedestal_orange'),
    item('dust:pedestal_green'),
    item('dust:pedestal_white'),
    item('dust:pedestal_black')
    ]
for(part in ref) {
    ore_dict.add("dPedestal", part)
}