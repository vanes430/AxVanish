package com.artillexstudios.axvanish.utils;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.PluginManager;

public final class Permissions {

    public static void register() {
        PluginManager pm = Bukkit.getPluginManager();

        register(pm, new Permission("axvanish.vanish", "Allows the player to use the vanish command", PermissionDefault.OP));
        register(pm, new Permission("axvanish.notify", "Allows the player to receive notifications when someone vanishes or unvanishes", PermissionDefault.OP));
        register(pm, new Permission("axvanish.command.toggle.other", "Allows the player to toggle vanish for other players", PermissionDefault.OP));
        register(pm, new Permission("axvanish.command.admin", "Access to the admin subcommands", PermissionDefault.OP));
        register(pm, new Permission("axvanish.command.admin.version", "Access to the version subcommand", PermissionDefault.OP));
        register(pm, new Permission("axvanish.command.admin.reload", "Access to the reload subcommand", PermissionDefault.OP));
        register(pm, new Permission("axvanish.group.*", "Allows assigning a player to a specific vanish group", PermissionDefault.FALSE));
    }

    private static void register(PluginManager pm, Permission permission) {
        if (pm.getPermission(permission.getName()) == null) {
            pm.addPermission(permission);
        }
    }
}
