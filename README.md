# ProjetPartie2-idm
## Auteurs
Semae Altinkaynak
Cédric Bevilacqua

## Objectifs
L'objectif du projet était de modéliser le portail pédagogique sous la forme d'un diagramme de classe afin de pouvoir le génerer sous différentes présentation comme html ou markdown. 
Nous devions donc crée un méta-modèle pour décrire les informations du portail pédagogique et puis crée le modèle de l'université de Lille. Pour cela nous devions procéder par une description de haut niveau d'abstraction afin de répertorier tous les élèments faisant partie du portail du Fil.
Nous devions faire la même chose lors de la création du méta-modèle html+bootstrap. L'objectif était donc de pouvoir génerer les informations du portail vers différentes cibles.  

## Contenu
Le projet permet de génerer, à partir d'une instance du méta modèle portail, un fichier markdown et un site internet. Nous pouvons donc génerer le site du fil sous 2 formes : 
- format web
- format markdown. 
Nous pouvons aussi, à partir de la représentation textuelle du modèle de l'université de lille, génerer un site internet et un fichier markdown. 

Le projet contient le méta modèle du portail et contient aussi le méta modele HTML. 
Il contient les 2 fichiers de transformations et les 2 fichiers de genérations.
Il contient un glossaire et des exemples de modèles.

Toutes les transformations demandées ont été implémentées et fonctionnent correctement.

Le fichier portailFromXtext contient la géneration d'un site internet et d'un fichier markdown à partir de la représentaion textuelle du modèle de l'université de Lille. 

Le fichier testXtext contient la représentation textuelle du modèle de l'université de Lille.

Le fichier portailHtml contient le site internet génerer à partir du modèle de l'université de Lille.

Le fichier portailMarkdown contient la représentation en markdown du modèle de l'université de Lille.

Chaque fichier contient la présentation arboresente du modele cible après tranformation et contient une représentation arboresente de l'université de Lille.

Etant novice en markdown, nous aurions pu avoir une meilleur présentation des élèments dans le fichier markdown. De plus le site généré est assez statique, nous pourrions éventuellement utiliser divers outils bootstrap afin de le rendre plus intéractif et plus agréable. Nous pourrions aussi ajouter des scripts JS afin de le rendre plus dynamique et d'en faire un site en ligne comme celui du fil.

