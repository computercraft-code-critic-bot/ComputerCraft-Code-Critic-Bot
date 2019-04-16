# ComputerCraft Code Critic Bot (C4Bot)

### Discord bot which attempts to help new programmers to code in lua

Currently, C4Bot only indirectly runs CCEmuX. However, the eventual goal of this project
is to evaluate a given ComputerCraft:Tweaked lua script from either discord or pastebin and
evaluate the scripts complexity (Did it use deprecated functions? Did it remember to use the local scope?).

### License
[LICENSE.txt](LICENSE.txt)

### Contributors
Lupus590

EveryOS

YOU! (Maybe)

### Special Thanks To
SquidDev - Converted ComputerCraft to ComputerCraft:Tweaked and wrote CCEmuX. 
Additionally, was a large help with getting gradle to work.

Dan200 - Initial developer of ComputerCraft

Other ComputerCraft and ComputerCraft:Tweaked contributors

Referenced sites of this project (e.g. https://discordapp.com, https://pastebin.com)

GitHub, and also Linus Torvalds - Git

Shadow, a gradle plugin

The people who wrote Gradle, also the people who came up with the idea of a ReadMe

Oracle & Sun - Java 1.8

Eclipse and IntelliJ - IDEs

etc, etc, you get it.

And YOU!

### Building and running
```
cd CCEmuX
./gradlew build
cd ..
./gradlew build
cd build/libs
java -jar Lupus590.C4Bot-<VERSION>.jar
```
Replace <VERSION> with the project version.
```
