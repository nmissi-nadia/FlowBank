# FlowBank
Gestion console des comptes bancaires — Java 8 Application pédagogique respectant les principes SOLID pour gérer comptes, opérations et règles métier.


---

#  Application de gestion bancaire (Java Console App)

##  Contexte

Ce projet est une application **console en Java 8** permettant la gestion de comptes bancaires et de leurs opérations (versements, retraits, virements).
Il respecte une architecture **MVC (Model – View – Controller)** afin de séparer la logique métier, l’affichage et le contrôle.

---

##  Fonctionnalités principales

* Création d’un compte (courant ou épargne)
* Effectuer un versement dans un compte
* Effectuer un retrait d’un compte
* Effectuer un virement entre deux comptes
* Consulter le solde d’un compte
* Consulter l’historique des opérations d’un compte

---

##  Architecture

* **Model** : contient les classes métiers (`Compte`, `CompteCourant`, `CompteEpargne`, `Operation`, `Versement`, `Retrait`)
* **Controller** : gère la logique applicative (`CompteController`, `OperationController`)
* **View** : interface console (`MainMenu`) permettant d’interagir avec l’utilisateur

---

##  Structure du projet

```
src/
 └── projet/
      ├── model/
      │    ├── Compte.java
      │    ├── CompteCourant.java
      │    ├── CompteEpargne.java
      │    ├── Operation.java
      │    ├── Versement.java
      │    └── Retrait.java
      │
      ├── controller/
      │    ├── CompteController.java
      │    └── OperationController.java
      │
      └── view/
           └── MainMenu.java
```

---

##  Technologies utilisées

* **Java 8**
* **Collections API** (`ArrayList`, `HashMap`)
* **Java Time API** (`LocalDate`)
* **UUID** pour générer les identifiants uniques des opérations

---

##  Exécution

1. Cloner ou importer le projet dans **IntelliJ** ou **Eclipse**
2. Lancer la classe `MainMenu`
3. Utiliser le menu interactif pour gérer les comptes et opérations

---

##  Auteur

Projet réalisé par Nmissi Nadia[nmissi-nadia].


