#  FlowBank:Gestion de Comptes Bancaires

##  Description

Ce projet est une application **Java orientée objet** qui illustre la gestion de comptes bancaires.
Elle est organisée en **trois couches** :

* **Presentation** : interaction avec l’utilisateur (menus et exécution).
* **Metier** : logique métier (classes `Compte`, `CompteCourant`, etc.).
* **Utilitaires** : gestion des validations et exceptions personnalisées.

L’objectif est de fournir une structure claire et modulaire, adaptée aux bonnes pratiques de développement.

---

##  Fonctionnalités principales

* Création de comptes bancaires (courant, épargne, etc.).
* Consultation du solde.
* Dépôt et retrait d’argent avec validations (montant positif, solde suffisant).
* Gestion des exceptions personnalisées.
* Architecture 3 couches pour une meilleure séparation des responsabilités.

---

##  Architecture du projet

```
MonProjet/
 ├─ src/
 │   ├─ presentation/
 │   │    └─ Main.java
 │   │    └─ Menu.java
 │   ├─ metier/
 │   │    ├─ Compte.java
 │   │    └─ CompteCourant.java
 │   │    └─ CompteEpargne.java
 │   │    └─ Operation.java
 │   │    └─ Retrait.java
 │   │    └─ Versement.java 
 │   └─ utilitaires/
 │        ├─ Validation.java
 │        └─ Exceptions.java
 ├─ bin/   (fichiers compilés .class)
 ├─ MANIFEST.MF
 └─ README.md
```

---

##  Installation et utilisation

### 1. Compiler le projet

Depuis la racine :

```bash
javac -d bin -sourcepath src src/presentation/Main.java
```

### 2. Exécuter le programme

```bash
java -cp bin presentation.Main
```

### 3. Générer un fichier `.jar`

1. Crée un fichier `MANIFEST.MF` :

   ```
   Main-Class: presentation.Main
   ```

   *(laisser une ligne vide à la fin)*

2. Générer le `.jar` :

   ```bash
   jar cfm MonProjet.jar MANIFEST.MF -C bin .
   ```

3. Exécuter le `.jar` :

   ```bash
   java -jar MonProjet.jar
   ```

---

##  Exemples d’utilisation

### Exemple 1 : Créer un compte

```
=== Menu Principal ===
1. Creer un compte
2. Consulter le solde
3. Faire un depot
4. Faire un retrait
0. Quitter
```

### Exemple 2 : Retrait avec solde insuffisant

```
Erreur : Solde insuffisant pour effectuer cette operation.
```

---

##  Technologies utilisées

* **Java 8+** (POO, exceptions, packages)
* **JDK** et outils en ligne de commande (`javac`, `java`, `jar`)

---

##  Bonnes pratiques mises en place

* Séparation en **3 couches** (présentation, métier, utilitaires).
* Utilisation des **packages Java** pour organiser le code.
* Gestion des **exceptions personnalisées**.
* Validation des données en entrée.
* Documentation claire et réutilisable.

---

##  Auteur

Projet développé par **\[NMISSI Nadia](nmissi-nadia)**, dans le cadre d’un apprentissage sur la programmation orientée objet en Java et l’architecture logicielle.


