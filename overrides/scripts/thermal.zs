val itemstoRemoves =
[
    "thermalfoundation:material_92"
] as string[];

for item in itemstoRemoves {
	recipes.removeByRecipeName(item);
}