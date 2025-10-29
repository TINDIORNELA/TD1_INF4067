# INF4067 - Principes SOLID - TD N°1

**Université de Yaoundé I - Master 1 Informatique**  
**Cours : UML et Design Patterns - 2025/2026**

## 👩‍🎓 Auteur
**DJAPANA TINDI CLAIRE ORNELA**  
**Matricule : 21T2438**  
**Master 1 Informatique**

## 📋 Description
Implémentation des 5 principes SOLID avec exemples "avant" et "après" refactoring.

## 🏗️ Structure du projet

TD1_INF4067/
├── 1_SRP/ # Single Responsibility Principle
│ ├── avant/ # Version violant le principe
│ └── apres/ # Version respectant le principe
├── 2_OCP/ # Open/Closed Principle
├── 3_LSP/ # Liskov Substitution Principle
├── 4_ISP/ # Interface Segregation Principle
└── 5_DIP/ # Dependency Inversion Principle


## 🛠️ Technologies
- **Langage** : Java
- **Outils** : Git, GitHub
- **Environnement** : ligne de commande Java

## 📚 Principes SOLID implémentés

### 1. SRP - Single Responsibility Principle
- **Problème** : Une classe avec trop de responsabilités
- **Solution** : Séparation en classes spécialisées

### 2. OCP - Open/Closed Principle  
- **Problème** : Modification nécessaire pour étendre les fonctionnalités
- **Solution** : Utilisation d'interfaces et polymorphisme

### 3. LSP - Liskov Substitution Principle
- **Problème** : Sous-classes non substituables à la classe parent
- **Solution** : Respect des contrats parent-enfant

### 4. ISP - Interface Segregation Principle
- **Problème** : Interfaces trop larges et généralistes
- **Solution** : Interfaces petites et ciblées

### 5. DIP - Dependency Inversion Principle
- **Problème** : Dépendances directes aux implémentations concrètes
- **Solution** : Dépendances aux abstractions

## 🚀 Comment exécuter

### Compilation et exécution
```bash
# Compiler un exemple
javac -d bin 1_SRP/avant/code/*.java

# Exécuter
java -cp bin srp.avant.Main# TD1_INF4067
