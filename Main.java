package com.lunarddosing;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin {
       
        @Override
        public void onDisable() {
               
        }
       
        @Override
        public void onEnable() {
                System.out.println("Made by __Lunar__");
        }
       
        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
                if(commandLabel.equalsIgnoreCase("bcast")) {
                        if(args[0].equalsIgnoreCase("blue")) {
                                String toBroadcast = "";
                                for (String s : args) {
                                        if(!s.contains("blue")) {
                                                toBroadcast = toBroadcast + s + " ";
                                        }
                                }
                                Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "SERVER" + ChatColor.DARK_GRAY + "]" + ChatColor.BLUE + ": " + toBroadcast);
                        } else if (args[0].equalsIgnoreCase("red")) {
                                String toBroadcast = "";
                                for (String s : args) {
                                        if(!s.contains("red")) {
                                                toBroadcast = toBroadcast + s + " ";
                                        }
                                }
                                Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "SERVER" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + ": " + toBroadcast);
                        } else {
                                String toBroadcast = "";
                                for (String s : args) {
                                        toBroadcast = toBroadcast + s + " ";
                                }
                                Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "SERVER" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + ": " + toBroadcast);
                        }
                }
                return false;
        }
 
}
