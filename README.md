# Parameters_in_TestNG

Remarques:
- les Paramètres dans TestNG est:
    - similaire aux annotations dans TestNG dans leur déclaration. 
    - Semblable aux paramètres de tout autre langage de programmation, ils sont déclarés pour transmettre certaines valeurs à la fonction.
- Une raison simple d’utiliser des paramètres est qu’ils nous permettent d’exécuter une fonction plusieurs fois avec des valeurs différentes ou d’exécuter différentes fonctions avec les mêmes valeurs
- Syntaxe : ``` @Parameters ({"a", "b"}) ``` où a et b sont les valeurs qui passent à la fonction.
-Les paramètres TestNG sont exécutés via le fichier XML TestNG et non directement à partir des fichiers de cas de test.

- Comme prévu, le deuxième test s’est exécuté avec les paramètres facultatifs car je n’ai déclaré aucun paramètre dans le fichier XML.

- Cela nous amène à la fin de ce code sur un sujet très confortable et très facile à comprendre. 
- @Parameters nous donne le pouvoir d’exécuter un grand nombre de tests différents en déclarant les valeurs des variables une seule fois. Cela rend notre partie test facile et efficace. 
- N’oubliez pas que vous pouvez utiliser l’annotation avec n’importe quelle méthode comportant une annotation.
 
 Enfin :
- la Paramètres TestNG et comment les utiliser pour transmettre les valeurs à votre classe de test à partir du fichier XML. Mais, il y a un problème avec les paramètres TestNG. Ils ont très bien fonctionné pour passer la valeur et exécuter les tests, mais cela ne se produit qu’une seule fois par exécution. 
- Que se passe-t-il si je souhaite exécuter le même test avec plusieurs valeurs ? Puis-je le faire avec des paramètres? Non, je ne peux pas car il s’agit d’une opération très courante lors des tests;  Il doit y avoir un moyen standard d’atteindre cet objectif. C’est là que TestNG DataProviders entre en scène
