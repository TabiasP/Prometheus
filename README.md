# Prometheus

## Contributors
Please make all contributions to the **Prototype** branch

## Intro
This text-based game programmed in Java assumes a character to experience 3 kinds of activities

* **Story** is the activity where the player is first displayed with an interactive story introduction, followed by one or more battles. The battles outcomes depend on the strength (health) of the character, his/her ammunition (weapon + armor) and a number of randomized factors. Same is applicable to enemies. Completing the story as a winner is associated with monetary reward. Loosing in at most one battle is the **game over** condition. (Suggestion: The story mode could be based on the story of Prometheus if anyone likes the idea).


* **Tournament** is where the character can **gamble** to *boost* or *loose* previously gained money. The tournament has a number of **levels of hardness** where opponents of matching skill levels will gamble with the character. The outcome of every round is randomized. The character can leave the tournament at any time, but will not be able to return to the same level there after, s/he will have to start from the very beginning. From this perspective the biggest difference in levels is the associated reward. The lower the level, the smaller reward (or loss). The character will not be allowed to gamble on the particular level shoud s/he not have enough money to match the possible reward / loss. The tournament style will be a 16 person single elimaination. (The stats (health weapon + armor, ) that the character achevied in game will be automatically transfered to the tournament.) The other players in the tournament will have stats weighted based on their placement in the tournament. As the other players progress in the tournament their stats will increase.

* **Shopping** is where the character can spend previously gained money (in story or tournament activity) and purchase better items for battles. Better items such as weapons, armor, and skills increases the chance of winning.


## Problem Formulation
All 3 activities should be implemented as standalone Java modules that can be instantiated into the game. The player should be given an interface (likely menu driven) to enter/leave particular game activities. The character him/herself should be modeled as an object with certain ammunition, money, health, and other attributes. Starting up particular activity should be implemented as a call to method `go()` of the character class that would take an instance of the activity object. The variety of activities should be implemented as derived classes from a set of 3 base classes (one per each kind of activity).

## Solution Components
There must be 5 packages to contain classes for:
1. Game
1. Character
1. Story activity
1. Tournament activity
1. Shopping activity

Additional packages included for functionality of the game:
* Enemy
* Battle System

## Characters
There should be additional characters alongside the Warrior and Orc for users to choose from. These are Wizard, Dwarf, Elf. Each character including the choosable and the enemies will have their own set of unique attributes set on a scale from 0 to 200. (The base attributes will be 0-100, but the scale to 200 allows for upgrades.) 

Base Attributes for each user character:
 
Warrior: | damage: 50 | magic: 20  | defense: 50 | boost: 50 | weapon damage: 60 | armor: 50 | intelligence: 50  | speed: 70 | resistance: 60 | strength: 60 |

----  Orc:   |  damage: 60 | magic: 30  | defense: 80 | boost: 50 | weapon damage: 80 | armor: 70 | intelligence: 10  | speed: 20 | resistance: 30 | strength: 90 |

Wizard: |  damage: 60 | magic: 100 | defense: 10 | boost: 50 | weapon damage: 40 | armor: 20 | intelligence: 100 | speed: 50 | resistance: 60 | strength: 40 |

-Dwarf:  | damage: 40 | magic: 30  | defense: 70 | boost: 50 | weapon damage: 60 | armor: 50 | intelligence:  30 | speed: 50 | resistance: 50 | strength: 60 |

-----Elf:   |  damage: 60 | magic: 60 | defense:  40 | boost: 50 | weapon damage: 60 | armor: 70 | intelligence:  80 | speed: 80 | resistance: 40 | strength: 60 |
  
 
		
A new class should be created for each character, and will derive from the character class. 

Damage level will be affected by the character intelligence, speed, and magic. 

## Enemies

There are various enemies. each enemy will have it's own class, deriving from the base character class. 
There is a grunt, goblin, halfling, siren, troll, scorpion, shapeshifter, giant, and necromancer. Each enemy will be given attributes, similar to the choosable characters. All of the enemies will have their strengths and weaknesses against whatever character is chosen. for example, The Grunt is the weakest enemy, susceptible to all attacks physical or magical, and the siren is strong against magic but very weak against physical attacks.

Base Attributes for each enemy:
 
Grunt: | damage: 20 | magic: 20  | defense: 20 | boost: 20 | weapon damage: 20 | armor: 20 | intelligence: 20  | speed: 20 | resistance: 30 | strength: 20 |

Goblin:  |  damage: 40 | magic: 30  | defense: 50 | boost: 30 | weapon damage: 50 | armor: 40 | intelligence: 60  | speed: 40 | resistance: 40 | strength: 40 |

Halfling: |  damage: 60 | magic: 40 | defense: 40 | boost: 50 | weapon damage: 40 | armor: 20 | intelligence: 50 | speed: 50 | resistance: 80 | strength: 40 |

Siren:  | damage: 100 | magic: 100  | defense: 20 | boost: 50 | weapon damage: 60 | armor: 30 | intelligence:  100 | speed: 80 | resistance: 100 | strength: 40 |

Troll:   |  damage: 70 | magic: 60 | defense:  90 | boost: 50 | weapon damage: 60 | armor: 70 | intelligence:  30 | speed: 40 | resistance: 110 | strength: 140 |

Scorpion:   |  damage: 100 | magic: 60 | defense:  160 | boost: 50 | weapon damage: 60 | armor: 140 | intelligence:  60 | speed: 110 | resistance: 180 | strength: 100 |

Shapeshifter:   |  damage: 120 | magic: 60 | defense:  150 | boost: 50 | weapon damage: 60 | armor: 70 | intelligence:  180 | speed: 100 | resistance: 150 | strength: 80 |

Giant:   |  damage: 160 | magic: 60 | defense:  190 | boost: 50 | weapon damage: 100 | armor: 200 | intelligence:  10 | speed: 30 | resistance: 80 | strength: 190 |

Necromancer:   |  damage: 200 | magic: 200 | defense:  140 | boost: 170 | weapon damage: 190 | armor: 130 | intelligence:  200 | speed: 80 | resistance: 200 | strength: 190 |
  



##Tournament Activity
The Tournament mode should be arcade style. Once you enter a tournament, the character is unable to leave the tournament until either they have defeated each opponent or they have run out of money and are unable to purchase a revive. You are unable to start a tournament unless you have the set wager amount.  


## Battle System
The battle system is the main action of the game, both in story mode and tournament mode. The following are different aspects of the battle system to be included:
* **Entering a battle -** When a player enters a battle, they will be given information about their enemies and the abilities, weapons, and items they have available, or be given an option to view the latter.
* **Types of Enemies -** The types of enemies the player will have to face should be described well such that the player can make decisions based on their knowledge of the enemy type. Each enemy will have different advantages that will make them a challenge for the player.
* **Health -** The health of the player and their enemies determines how much longer they can fight.
* **Weapons and Abilities -** The player will have different abilities and weapons available for them to use in the battle (either found through the story, obtained through leveling up, or bought in the store), and information about each of them should be available to the player. Stronger weapons may have limited use in battle, while at least one attack (such as a punch) will be weak, but have unlimited uses. The player must choose wisely when deciding on how to attack.
* **Items -** The player can obtain different items that have a one-time use during battles. These items can do things such as heal the player, boost the player's stats, or cause different effects during battle.

