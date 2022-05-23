# elosztott_alkalmazasok
GDF - Házi feladat
12 - Kertészet

Felhasználói segédlet:

Legelső induláskor nevet kell adni a kertészetnek az erre a célra készített segéd form-on. Ez megjelenik a főképernyő
fejlécében és nagy betűkkel a felső részen is.

Először a "Vásárlók" fülre -> "Új vásárló" gombra kattintva vevőket kell felvinni.
Megadható a neve, a kezdő egyenlege és a kedvezmény mértéke. Üres egyenleg esetén 10.000 a kezdőtőke.
Mintaadatok: begépelgetés helyett 5 mintasort visz fel.
Fizetés: Összeget beírva hozzáadja a kiválasztott vásárló egyenlegéhez.

Készlet: 
Ha volt mentett állomány, akkor automatikusan beolvassa. Ha még nem volt, akkor a "Mintaadatok" gomb megnyomásával
10 sor adatot tölt be. A "Mentés" gombbal kiírható file-ba, a következő induláskor pedig betölti.

Eladás:
Először ki kell választani a vásárlót, majd a "Vásárló kiválasztása" gombbal "rögzíthető"
Ezután lehet a "Készlet"-ből választani, kattintásra aktívvá válik a "Darabszám" és a "Kosárba" gomb.
A darabszám 1-től a kiválasztott tétel készletének erejéig állítható.
"Kosárba" gomb, megerősítés, és a "Kosár" tartalmába kerül a kiválasztott tétel a megfelelő darabszámmal.
A "Kosár" módosításakor a vásárló egyenlege és a kosár értéke összehasonlításra kerül, üzenet, ha a kosár
értéke meghaladja a vevő egyenlegét.
"Töröl" gomb: a kosáron kiválasztott tétel törlése, a készlet visszaáll
"Fizetés" gomb: a vevő egyenlege csökken, a kosár tartalma kiürül

"Technikai segítség" fül: aláírásként
