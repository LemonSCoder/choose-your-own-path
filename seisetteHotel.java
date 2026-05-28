import java.util.Scanner;

public class seisetteHotel {
    public static int instrumentNum = 0;
    public static int routeNum = 0;
    public static boolean alreadyDoorFour = false;
    public static boolean alreadyDoorThirteen = false;
    public static boolean alreadyDoorSeventeen = false;
    public static boolean alreadyDoorSixSeven = false;
    public static boolean obsidianSword = false;
    public static boolean titaniumWings = false;
    public static boolean goldenGoblet = false;
    public static boolean trollClub = false;
    public static boolean checkedChest = false;
    public static boolean truthRevealed = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've found yourself trapped at the Seisette hotel. If you don't escape in time, you will be killed by the poisonous fog slowly inching its way behind you.");
        System.out.println("In front of you are four doors labeled 4, 13, 17, and 67. Which one will you choose? (You can't go through a door you've already been through)");
        System.out.println("[A] 4 \n[B] 13 \n[C] 17 \n[D] 67");
        String doorInput = sc.nextLine();
        while (routeManager(routeNum, doorInput).equals("Invalid path.") || routeNum < 10) {
            if (routeNum == 0) {
                System.out.println("Which door will you choose? (You can't go through a door you've already been through)");
                System.out.println("[A] 4 \n[B] 13 \n[C] 17 \n[D] 67");
            } else if (routeNum ==  1) {
                System.out.println("[A] Flute \n[B] Trumpet \n[C] Snare Drum");
            } else if (routeNum == 2) {
                if (instrumentNum != 0) {
                    System.out.println("[A] Dance\n[B] Ask for directions\n[C] Sing");
                } else {
                    System.out.println("[A] Dance\n[B] Ask for directions");          
                }
            } else if (routeNum == 3) {
                if (checkedChest == true) {
                    System.out.println("The room is locked behind you. You cannot leave. What will you do?");
                    System.out.println("[A] Fight troll");
                } else if (checkedChest == false) {
                    System.out.println("[A] Fight troll \n[B] Check treasure chest");
                }
            } else if (routeNum == 4) {
                System.out.println("[A] Swim straight \n[B] Swim down");
            } else if (routeNum == 5) {
                System.out.println("[A] Obsidian Sword \n[B] Golden Goblet of Truth\n[C] Titanium Wings"); 
            } else if (routeNum == 6) {
                if (goldenGoblet == true && truthRevealed == false) {
                    System.out.println("[A] Left \n[B] Right\n[C] Consult the Golden Goblet of Truth"); 
                } else if ((goldenGoblet == true && truthRevealed == true) || goldenGoblet == false) {
                    System.out.println("[A] Left \n[B] Right"); 
                }
            } else if (routeNum == 7) {
                System.out.println("After exiting the room, you are approached by two more doors labeled 3 and 89. Which one will you choose?");
                System.out.println("[A] 3 \n[B] 89");
            } else if (routeNum == 8) {
                System.out.println("[A] Fight \n[B] Run");    
            } else if (routeNum == 9) {
                System.out.println("[A] Up \n[B] Center\n[C] Down");
            }
            doorInput = sc.nextLine();
        }

    }
    public static String routeManager(int currentPathNum, String chosenDoorNum) {
        if (currentPathNum == 0) {
            if (chosenDoorNum.toUpperCase().contains("A") && alreadyDoorFour == true || chosenDoorNum.toUpperCase().contains("B") && alreadyDoorThirteen == true || chosenDoorNum.toUpperCase().contains("C") && alreadyDoorSeventeen == true || chosenDoorNum.toUpperCase().contains("D") && alreadyDoorSixSeven == true) {
                System.out.println("You've already gone through this door!");
                return "Invalid path.";
            } else {
                if (chosenDoorNum.toUpperCase().contains("A")) {
                    routeNum++;
                    System.out.println("You've entered the marching band room! There are three instruments lying on the ground. Which one will you choose?");
                    return "Hello";
                } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                    routeNum += 2;
                    System.out.println("You've entered a frog disco! What will you do?");
                    return "Hello";

                } else if ((chosenDoorNum.toUpperCase().contains("C"))) {
                    routeNum += 3;
                    System.out.println("You're in some sort of an arena. There's a troll with a club in their hand guarding a door and a treasure chest in the corner of the room. What will you do?");
                    return "Hello";
                } else if ((chosenDoorNum.toUpperCase().contains("D"))) {
                    routeNum += 4;
                    System.out.println("You've found yourself in a pool. It looks very deep and expansive. However, you don't know in which direction you want to swim? What will you do?");
                    return "Hello";
                } else {
                    System.out.println("Invalid input.");
                    return "Invalid path.";
                }
            }
        } else if (currentPathNum == 1) {
            alreadyDoorFour = true;
            if (chosenDoorNum.toUpperCase().contains("A")) {
                routeNum = 0;
                instrumentNum++;
                System.out.println("You took the flute and left the room.");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 0;
                instrumentNum += 2;
                System.out.println("You took the trumpet and left the room.");
                return "Hello";

            } else if ((chosenDoorNum.toUpperCase().contains("C"))) {
                routeNum = 0;
                instrumentNum += 3;
                System.out.println("You took the snare drum and left the room.");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 2) {
            alreadyDoorThirteen = true;
            if (chosenDoorNum.toUpperCase().contains("A")) {
                routeNum = 0;
                System.out.println("You dance with the frogs. You hear croaks of the numbers '4' and '67'. Not sure if that means anything. You shortly leave the room after dancing for a bit.");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 0;
                System.out.println("You ask the frogs for directions, but they are USELESS. You exit the room in frustration.");
                return "Hello";

            } else if ((chosenDoorNum.toUpperCase().contains("C")) && instrumentNum != 0) {
                routeNum = 0;
                System.out.println("You sing with the frogs. One of them tells you that door seventeen has a couple of useful items inside of it. You leave the room shortly after.");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 3) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                if (instrumentNum != 0 && (obsidianSword == true || goldenGoblet == true || titaniumWings == true)) {
                    String addString = "";
                    String addString2 = "";
                    Scanner sc = new Scanner(System.in);
                    System.out.println("There are multiple items you can use to fight the troll. Which one do you choose?");
                    if (obsidianSword == true) {
                        addString += "Obsidian Sword";
                    } else if (goldenGoblet == true) {
                        addString += "Golden Goblet of Truth";
                    } else if (titaniumWings == true) {
                        addString += "Titanium Wings";
                    }
                    if (instrumentNum == 1) {
                        addString2 += "Flute";
                    } else if (instrumentNum == 2) {
                        addString2 += "Trumpet";
                    } else if (instrumentNum == 3) {
                        addString2 += "Snare Drum";
                    }
                    System.out.println("[A] " + addString2 + "\n[B] "+ addString);
                    String weaponChoice = sc.nextLine();
                    while (weaponChoice.toUpperCase().contains("A") == false && weaponChoice.toUpperCase().contains("B") == false) {
                        System.out.println("[A] " + addString2 + "\n[B] "+ addString);
                        weaponChoice = sc.nextLine();             
                    }
                    if (weaponChoice.toUpperCase().contains("A")) {
                    if (instrumentNum != 0) {
                        if (instrumentNum == 1) {
                            routeNum = 7;
                            trollClub = true;
                            System.out.println("Thank goodness you had a flute in your hand. You bash the troll in the head with your flute, causing it to break in the process. The troll falls to the ground. You take the troll's club.");
                        } else if (instrumentNum == 2) {
                            routeNum = 7;
                            trollClub = true;
                            System.out.println("Your trumpet came in handy! You bashed the troll over the head, causing it to crumble to the ground. Your trumpet broke, but you got the troll's club.");
                        } else if (instrumentNum == 3) {
                            routeNum = 7;
                            System.out.println("You fling the snare drum and gut the troll. The snare drum breaks. The troll's still alive, so you couldn't grab the troll's club.");
                        }
                        instrumentNum = 0;
                    }
                } else if (weaponChoice.toUpperCase().contains("B")) {
                        if (obsidianSword == true) {
                            routeNum = 7;
                            obsidianSword = false;
                            trollClub = true;
                            System.out.println("You chop the troll's head off with your obsidian sword. The troll oozed out hydrofluoric acid, causing the sword to disintegrate. You grab the troll's club.");
                        } else if (goldenGoblet == true) {
                            routeNum = 7;
                            goldenGoblet = false;
                            System.out.println("You throw the golden goblet away from the door, causing the troll to run after it. You make a run for the door.");
                        } else if (titaniumWings == true) {
                            routeNum = 7;
                            titaniumWings = false;
                            System.out.println("You soar above the troll, having to remove the wings in order to fit inside the door.");
                        }
                } else {
                    System.out.println("Invalid input.");
                }
                } else if (instrumentNum != 0) {
                        if (instrumentNum == 1) {
                            routeNum = 7;
                            trollClub = true;
                            System.out.println("Thank goodness you had a flute in your hand. You bash the troll in the head with your flute, causing it to break in the process. The troll falls to the ground. You take the troll's club.");
                        } else if (instrumentNum == 2) {
                            routeNum = 7;
                            trollClub = true;
                            System.out.println("Your trumpet came in handy! You bashed the troll over the head, causing it to crumble to the ground. Your trumpet broke, but you got the troll's club.");
                        } else if (instrumentNum == 3) {
                            routeNum = 7;
                            System.out.println("You fling the snare drum and gut the troll. The snare drum breaks. The troll's still alive, so you couldn't grab the troll's club.");
                        }
                        instrumentNum = 0;
                } else if (obsidianSword == true || goldenGoblet == true || titaniumWings == true) {
                        if (obsidianSword == true) {
                            routeNum = 7;
                            obsidianSword = false;
                            trollClub = true;
                            System.out.println("You chop the troll's head off with your obsidian sword. The troll oozed out hydrofluoric acid, causing the sword to disintegrate. You grab the troll's club.");
                        } else if (goldenGoblet == true) {
                            routeNum = 7;
                            goldenGoblet = false;
                            System.out.println("You throw the golden goblet away from the door, causing the troll to run after it. You make a run for the door.");
                        } else if (titaniumWings == true) {
                            routeNum = 7;
                            titaniumWings = false;
                            System.out.println("You soar above the troll, having to remove the wings in order to fit inside the door.");
                        }
                } else {
                    routeNum = 10;
                    System.out.println("It was not smart fighting the troll without any weapons. You ended up dying.");
                    System.out.println("Ending One: Death By Troll");
                }
                //We stopped here :)
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B")) && checkedChest == false) {
                checkedChest = true;
                routeNum = 5;
                System.out.println("You take a closer look at the treasure chest. Inside, there's an Obsidian Sword, a Golden Goblet of Truth, and Titanium Wings. You can only take one from the chest. Which one will you take?");
                return "Hello";

            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 4) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                System.out.println("Oh dear. It turns out this pool is infinitely wide. After swimming for hours on end, you died.");
                System.out.println("Ending Two: Death from Swimming too Much");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 6;
                System.out.println("There appears to be two drains. Only one of them will successfully drain the pool and show you where the door is. Which one will you choose?");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 5) {
            routeNum = 3;
            if (chosenDoorNum.toUpperCase().contains("A")) {
                obsidianSword = true;
                System.out.println("You take the Obsidian Sword.");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                goldenGoblet = true;
                System.out.println("You take the Golden Goblet of Truth.");
                return "Hello";

            } else if ((chosenDoorNum.toUpperCase().contains("C"))) {
                titaniumWings = true;
                System.out.println("You take the Titanium Wings.");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 6) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                System.out.println("You chose the wrong drain! You got sprayed by a mysterious gas. Next thing you know, you're dead.");
                System.out.println("Ending Three: Death by Drain Gas");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 7;
                System.out.println("The water starts to drain rapidly, and a door appears in front of you.");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("C")) && truthRevealed == false) {
                truthRevealed = true;
                System.out.println("the Golden Goblet of Truth reveals that the right drain is the right one to pull.");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 7) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                routeNum = 8;
                System.out.println("Oh dear. There's an ogre guarding the exit. The door locks behind you. What will you do?");
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 9;
                if (titaniumWings == true) {
                    System.out.println("You enter the room. The exit is a tiny speck in the distance as you stand on a cliff. You jump off the cliff with your Titanium Wings and start to fly. There are three paths you can take: up, down, or center. Which one will you take?");       
                    return "Hello";
                } else if (titaniumWings == false) {
                    System.out.println("You enter the room. The exit is a tiny speck in the distance as you stand on a cliff. A pair of wax wings form, and you start to fly. There are three paths you can take: up, down, or center. Which one will you take?");            
                }
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 8) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                if (instrumentNum != 0 && (obsidianSword == true || goldenGoblet == true || titaniumWings == true) || instrumentNum != 0 && trollClub == true || (obsidianSword == true || goldenGoblet == true || titaniumWings == true) && trollClub == true) {
                    String addString = "";
                    String addString2 = "";
                    Scanner sc = new Scanner(System.in);
                    System.out.println("There are multiple items you can use to fight the ogre. Which one do you choose?");
                    if (obsidianSword == true) {
                        addString += "Obsidian Sword";
                    } else if (goldenGoblet == true) {
                        addString += "Golden Goblet of Truth";
                    } else if (titaniumWings == true) {
                        addString += "Titanium Wings";
                    } else if (instrumentNum == 1) {
                        addString += "Flute";
                    } else if (instrumentNum == 2) {
                        addString += "Trumpet";
                    } else if (instrumentNum == 3) {
                        addString += "Snare Drum";
                    }
                    if (trollClub == true) {
                        addString2 += "Troll Club";
                    }
                    System.out.println("[A] " + addString + "\n[B] "+ addString2);
                    String weaponChoice = sc.nextLine();
                    while (weaponChoice.toUpperCase().contains("A") == false && weaponChoice.toUpperCase().contains("B") == false && weaponChoice.toUpperCase().contains("C") == false) {
                        System.out.println("[A] " + addString + "\n[B] "+ addString2);
                        weaponChoice = sc.nextLine();             
                    }
                if (weaponChoice.toUpperCase().contains("A")) {
                    if (instrumentNum != 0) {
                        if (instrumentNum == 1) {
                            routeNum = 10;
                            System.out.println("Your flute breaks in combat, and you die to the ogre.");
                            System.out.println("Ending Four: Death by Ogre");
                        } else if (instrumentNum == 2) {
                            routeNum = 10;
                            System.out.println("Your trumpet breaks in combat, and you die to the ogre.");
                            System.out.println("Ending Four: Death by Ogre");
                        } else if (instrumentNum == 3) {
                            routeNum = 10;
                            System.out.println("You fling the snare drum and gut the troll. The snare drum breaks. However, the ogre falls to the floor and you successfully make a run for the door.");
                            System.out.println("Ending Eight: Death by Ogre");
                        } else if (obsidianSword == true) {
                            routeNum = 10;
                            obsidianSword = false;
                            System.out.println("You chop the ogre's head off with your obsidian sword. It's really lodged in there though, so you rushed to the exit without it.");
                            System.out.println("Ending Eight: Successful Escape");
                        } else if (goldenGoblet == true) {
                            routeNum = 10;
                            goldenGoblet = false;
                            System.out.println("Your golden goblet did not sway the ogre. It killed you within seconds.");
                            System.out.println("Ending Four: Death by Ogre");
                        } else if (titaniumWings == true) {
                            routeNum = 10;
                            titaniumWings = false;
                            System.out.println("The ogre crushed your wings and swallowed you whole.");
                            System.out.println("Ending Four: Death by Ogre");
                        }
                        instrumentNum = 0;
                    }    
                } else if (weaponChoice.toUpperCase().contains("B") && trollClub == true) {
                    trollClub = false;
                    routeNum = 10;
                    System.out.println("You easily beat the ogre and kill it with the troll club. You casually waltz towards the exit.");
                    System.out.println("Ending Eight: Successful Escape");
                } else {
                    System.out.println("Invalid input.");
                }
                } else if (instrumentNum != 0) {
                        if (instrumentNum == 1) {
                            routeNum = 10;
                            System.out.println("Your flute breaks in combat, and you die to the ogre.");
                            System.out.println("Ending Four: Death by Ogre");
                        } else if (instrumentNum == 2) {
                            routeNum = 10;
                            System.out.println("Your trumpet breaks in combat, and you die to the ogre.");
                            System.out.println("Ending Four: Death by Ogre");
                        } else if (instrumentNum == 3) {
                            routeNum = 10;
                            System.out.println("You fling the snare drum and gut the troll. The snare drum breaks. However, the ogre falls to the floor and you successfully make a run for the door.");
                            System.out.println("Ending Eight: Successful Escape");
                        }
                        instrumentNum = 0;
                } else if (obsidianSword == true || goldenGoblet == true || titaniumWings == true) {
                    if (obsidianSword == true) {
                        routeNum = 10;
                        obsidianSword = false;
                        System.out.println("You chop the ogre's head off with your obsidian sword. It's really lodged in there though, so you rushed to the exit without it.");
                        System.out.println("Ending Eight: Successful Escape");
                    } else if (goldenGoblet == true) {
                        routeNum = 10;
                        goldenGoblet = false;
                        System.out.println("Your golden goblet did not sway the ogre. It killed you within seconds.");
                        System.out.println("Ending Four: Death by Ogre");
                    } else if (titaniumWings == true) {
                        routeNum = 10;
                        titaniumWings = false;
                        System.out.println("The ogre crushed your wings and swallowed you whole.");
                        System.out.println("Ending Four: Death by Ogre");
                    }
                } else if (trollClub == true) {
                    trollClub = false;
                    routeNum = 10;
                    System.out.println("You easily beat the ogre and kill it with the troll club. You casually waltz towards the exit.");
                    System.out.println("Ending Eight: Successful Escape");
                } else {
                    routeNum = 10;
                    System.out.println("It was not smart fighting the ogre without any weapons. You ended up dying.");
                System.out.println("Ending Four: Death by Ogre");
                }
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 10;
                System.out.println("There was no use in running. In a matter of seconds, red is splattered all over the place.");
                System.out.println("Ending Four: Death by Ogre");
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        } else if (currentPathNum == 9) {
            if (chosenDoorNum.toUpperCase().contains("A")) {
                routeNum = 10;
                if (titaniumWings == true) {
                    System.out.println("You soar high into the sky, and what do you know? The exit moves to meet you.");
                    System.out.println("Ending Eight: Successful Escape");
                } else if (titaniumWings == false) {
                    System.out.println("Ah, you poor soul. Have you ever heard of the story of Icarus? The wax wings melt from the sun's heat, and you plummet towards the ground below.");
                    System.out.println("Ending Five: Death by Flying too Close to the Sun");
                }
                return "Hello";
            } else if ((chosenDoorNum.toUpperCase().contains("B"))) {
                routeNum = 10;
                System.out.println("You were sailing smoothly across the sky until a piranha jumped out of nowhere and ate you.");
                System.out.println("Ending Six: Death by Piranha");
                return "Hello";

            } else if ((chosenDoorNum.toUpperCase().contains("C"))) {
                routeNum = 10;
                if (instrumentNum == 3 || obsidianSword == true) {
                    String heavyItem = "";
                    if (instrumentNum == 3 && obsidianSword == true) {
                        heavyItem += "Snare Drum and Obsidian Sword";
                    } else if (instrumentNum == 3) {
                        heavyItem += "Snare Drum";
                    } else if (obsidianSword == true) {
                        heavyItem += "Obsidian Sword";
                    }
                    System.out.println("You drop down low, only for you to lose your balance from the " + heavyItem + " you carried.");
                    System.out.println("Ending Seven: Death by Heavy Items");
                } else {
                    System.out.println("You soar below, with the exit coming to greet you.");
                    System.out.println("Ending Eight: Successful Escape");
                }
                return "Hello";
            } else {
                System.out.println("Invalid input.");
                return "Invalid path.";
            }
        }
        return "Hello";
    }
}
