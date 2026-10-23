# patt-observer

Petite implémentation en Java du **design pattern Observer** (Observateur).

## Principe

Un sujet (`Observable`) maintient une liste d'observateurs (`Observer`) et les notifie automatiquement à chaque changement de son état.

## Structure

```
src/main/java/net/noureddine
├── Main.java                  # Démo : abonnements, changements d'état, désabonnement
└── obs
    ├── Observable.java        # Interface du sujet (subscibe, unsubscribe, notifyObservers)
    ├── ObservableImpl.java    # Sujet concret : détient un état entier et notifie à chaque setState
    ├── Observer.java          # Interface fonctionnelle : update(int newState)
    ├── ObserverImpl.java      # Observateur 1 : affiche le nouvel état
    └── ObserverImpl2.java     # Observateur 2 : calcule la moyenne de l'historique des états
```

Dans `Main`, un troisième observateur est défini sous forme de lambda (affiche `newState * cos(newState)`).

## Prérequis

- JDK 26
- Maven

## Compilation et exécution

```bash
mvn compile
```

`Main` utilise une méthode `main()` d'instance/sans arguments (fonctionnalité des versions récentes de Java) ; lancez-la depuis votre IDE (IntelliJ) ou avec :

```bash
java --enable-preview --source 26 src/main/java/net/noureddine/Main.java
```

## Exemple de scénario (`Main`)

1. Trois observateurs s'abonnent à l'`ObservableImpl`.
2. L'état passe successivement à `40`, `90`, `10` : tous les observateurs sont notifiés.
3. `ObserverImpl2` se désabonne.
4. L'état passe à `5040` : seuls les deux observateurs restants sont notifiés.
