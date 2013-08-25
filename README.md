scaladrools
===========

Invoke Drools rule engine using Scala

## Testing Set Up:
* Windows 7
* Java 1.7
* Drools 5.5.0 Final
* Scala 2.11.0-M4

## IntelliJ IDEA How To:
1. Install Scala using the Windows installer (version 2.11.0-M4)
2. Install the Scala plugin for IntelliJ ( I am using version 12)
3. Create a new project as "Scala Module"
4. Open _RuleRunner.scala_ in the editor, and `ctrl+shift+F10`. That's it.

## Warning:
* It seems that earlier version of Scala had a bug that caused failure when loading `KnowledgeBuilderFactory` class of Drools. Scala version 2.11 still provides a warning, but seems to work fine.