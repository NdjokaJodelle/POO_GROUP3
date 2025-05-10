# Projet POO: GROUP4 Data science.

## Équipe de développement
Ce projet a été réalisé par une équipe de cinq étudiants dans le cadre du cours de Programmation Orientée Objet. Il s'agit de:

`Membres:`
* NDJOKA NGHOKO JODELLE BARUCH 22E0480EP
* MEFIRA MOHAMADOU 24ENSPM451
* MAMOUDOU MOUSTAPHA 24ENSPM450
* MOUAFO FOKAM OGUILVY DARIL 22E0479EP
* MOUSTAPHA ARNOLD BATCHELOR 24ENSPM487

## Description du projet
Ce projet Java implémente un système de gestion de formes géométriques, en se concentrant sur les rectangles. Il démontre les concepts fondamentaux de la Programmation Orientée Objet, notamment l'héritage, le polymorphisme, la surcharge et la redéfinition de méthodes. Le projet permet de manipuler des rectangles standards ainsi que des rectangles inclinés (SlantedRectangle), qui sont une extension du concept de base.

## Structure du projet
- **Point.java** : Classe représentant un point dans un plan cartésien avec ses coordonnées (x,y)
- **Rectangle.java** : Classe définissant un rectangle standard avec ses propriétés et méthodes
- **SlantedRectangle.java** : Classe étendant Rectangle pour gérer des rectangles inclinés avec un angle de rotation
- **Main.java** : Programme principal démontrant l'utilisation des classes

## Fonctionnalités principales
- Création de points et de rectangles avec différentes méthodes de construction
- Manipulation de rectangles (translation, rotation)
- Calcul de surfaces
- Vérification d'inclusion de points et d'autres rectangles
- Support pour des rectangles inclinés avec des angles arbitraires
- Affichage des propriétés des formes

## Concepts de POO illustrés
- **Héritage** : SlantedRectangle hérite de Rectangle
- **Polymorphisme** : Les méthodes peuvent être appelées sur des objets de différents types
- **Encapsulation** : Attributs privés avec accesseurs et mutateurs (getters/setters)
- **Redéfinition de méthodes** : Adaptation des méthodes héritées pour le comportement spécifique des rectangles inclinés
- **Surcharge** : Multiples versions des constructeurs et méthodes avec différentes signatures

## Particularités d'implémentation
- Les rectangles standards sont définis par un point d'origine, une longueur et une largeur
- Les rectangles inclinés ajoutent un angle de rotation par rapport à l'horizontale
- Les calculs d'inclusion prennent en compte les transformations géométriques nécessaires

## Exercices et solutions
Le projet est accompagné d'un document de solutions pour divers exercices qui explorent les concepts de POO comme :
- Redéfinition de méthodes
- Surcharge de méthodes
- Instances et polymorphisme avec l'opérateur `instanceof`
- Comportement des attributs vs méthodes en héritage
## Remarques
Certaines méthodes nécessitent une attention particulière lors de l'extension de la classe Rectangle, notamment pour la gestion correcte de l'inclusion et des transformations géométriques des rectangles inclinés.

La branche main contient tout le devoir produit: les codes dans les fichiers java et la partie théorique dans un fichier markdown.
Les branches NDJOKA et MEFIRA contiennent les parties de travaux déposé par les participants
