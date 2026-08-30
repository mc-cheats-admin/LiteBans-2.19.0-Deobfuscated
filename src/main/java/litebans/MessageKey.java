package litebans;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MessageKey
extends Enum
implements CharSequence {
    public static final MessageKey LiteBansModule_21 = new MessageKey("CMD", 0, "command");
    public static final MessageKey BaseCoreGenericHandler = new MessageKey("C_BAN", 1, LiteBansModule_21, "ban");
    public static final MessageKey LiteBansModule_96 = new MessageKey("C_MUTE", 2, LiteBansModule_21, "mute");
    public static final MessageKey LiteBansModule_9 = new MessageKey("C_WARN", 3, LiteBansModule_21, "warn");
    public static final MessageKey bk = new MessageKey("C_KICK", 4, LiteBansModule_21, "kick");
    public static final MessageKey LiteBansModule_82 = new MessageKey("C_HISTORY", 5, LiteBansModule_21, "history");
    public static final MessageKey LiteBansModule_132 = new MessageKey("C_STAFFHISTORY", 6, LiteBansModule_21, "staffhistory");
    public static final MessageKey LiteBansModule_107 = new MessageKey("C_WARNINGS", 7, LiteBansModule_21, "warnings");
    public static final MessageKey LiteBansModule_71 = new MessageKey("C_PRUNEHISTORY", 8, LiteBansModule_21, "prunehistory");
    public static final MessageKey bH = new MessageKey("C_STAFFROLLBACK", 9, LiteBansModule_21, "staffrollback");
    public static final MessageKey W = new MessageKey("C_BANLIST", 10, LiteBansModule_21, "banlist");
    public static final MessageKey bZ = new MessageKey("C_IPHISTORY", 11, LiteBansModule_21, "iphistory");
    public static final MessageKey bJ = new MessageKey("C_NAMEHISTORY", 12, LiteBansModule_21, "namehistory");
    public static final MessageKey cN = new MessageKey("C_DUPEIP", 13, LiteBansModule_21, "dupeip");
    public static final MessageKey LiteBansModule_140 = new MessageKey("C_IPREPORT", 14, LiteBansModule_21, "ipreport");
    public static final MessageKey LiteBansModule_122 = new MessageKey("C_CHECKBAN", 15, LiteBansModule_21, "checkban");
    public static final MessageKey LiteBansModule_61 = new MessageKey("C_CHECKMUTE", 16, LiteBansModule_21, "checkmute");
    public static final MessageKey EventsHandler = new MessageKey("C_CHECKWARN", 17, LiteBansModule_21, "checkwarn");
    public static final MessageKey dg = new MessageKey("C_LASTUUID", 18, LiteBansModule_21, "lastuuid");
    public static final MessageKey BanHandler_5 = new MessageKey("C_LOCKDOWN", 19, LiteBansModule_21, "lockdown");
    public static final MessageKey LiteBansModule_12 = new MessageKey("C_GEOIP", 20, LiteBansModule_21, "geoip");
    public static final MessageKey i = new MessageKey("C_LITEBANS", 21, LiteBansModule_21, "litebans");
    public static final MessageKey LiteBansModule_50 = new MessageKey("HEX_FORMATS", 22, "hex_formats", (CharSequence)"&%AsyncBackgroundTask_21\n<%AsyncBackgroundTask_21>\n{%AsyncBackgroundTask_21}");
    public static final MessageKey LiteBansModule = new MessageKey("DATE_FORMAT", 23, "time_format", (CharSequence)"yyyy-MM-LiteBansModule_118");
    public static final MessageKey Utf8Handler_2 = new MessageKey("DEFAULT_BAN_REASON", 24, "default_ban_reason", (CharSequence)"The Ban Hammer has spoken!");
    public static final MessageKey LiteBansModule_118 = new MessageKey("DEFAULT_MUTE_REASON", 25, "default_mute_reason", (CharSequence)"Spamming");
    public static final MessageKey df = new MessageKey("DEFAULT_UNBAN_REASON", 26, "default_unban_reason", (CharSequence)"No reason ");
    public static final MessageKey LockdownService = new MessageKey("DEFAULT_UNMUTE_REASON", 27, "default_unmute_reason", (CharSequence)"No reason ");
    public static final MessageKey cu = new MessageKey("DEFAULT_UNWARN_REASON", 28, "default_unwarn_reason", (CharSequence)"No reason ");
    public static final MessageKey LiteBansModule_66 = new MessageKey("BANNED_MESSAGE_BASE", 29, "banned_message_base", (CharSequence)(BlackHandler.c + "You are banned from this server!" + BlackHandler.Utf8Handler_2 + "\n\nBanned on: $dateStart\nBanned LiteBansModule_61: $executor\nReason: $reason" + BlackHandler.Utf8Handler_2 + '\n'));
    public static final MessageKey bS = new MessageKey("BANNED_MESSAGE", 30, "banned_message", (CharSequence)"$base\nExpires InitializerHandler_3: $duration\n$appealMessage");
    public static final MessageKey F = new MessageKey("BANNED_MESSAGE_PERMANENT", 31, "banned_message_permanent", (CharSequence)"$base\nYou are permanently banned!\n$appealMessage");
    public static final MessageKey CommandThrottleService = new MessageKey("BANNED_MESSAGE_APPEAL", 32, "banned_message_appeal_message", (CharSequence)"");
    public static final MessageKey LiteBansModule_116 = new MessageKey("BANNED_MESSAGE_GEOIP", 33, "banned_message_geoip_blacklist", (CharSequence)(BlackHandler.c + "You are banned from this server!" + BlackHandler.Utf8Handler_2 + "\n\nYour location is blacklisted: $geoip"));
    public static final MessageKey AsyncBackgroundTask_5 = new MessageKey("BANNED_MESSAGE_SWITCH", 34, "proxy_switch_banned", (CharSequence)(BlackHandler.c + "You are banned on $serverScope! Reason:\n$reason"));
    public static final MessageKey aj = new MessageKey("BANNED_MESSAGE_SWITCH_TEMP", 35, "proxy_switch_tempbanned", (CharSequence)(BlackHandler.c + "You are banned on $serverScope! Reason:\n$reason\nExpires InitializerHandler_3: $duration"));
    public static final MessageKey ak = new MessageKey("MUTED", 36, "muted", (CharSequence)(BlackHandler.c + "You are muted! ($duration remaining)!\n" + BlackHandler.c + "Reason: " + BlackHandler.ServerSyncService + "$reason"));
    public static final MessageKey AsyncBackgroundTask = new MessageKey("MUTED_PERMANENT", 37, "muted_permanent", (CharSequence)(BlackHandler.c + "You are permanently muted!\n" + BlackHandler.c + "Reason: " + BlackHandler.ServerSyncService + "$reason"));
    public static final MessageKey du = new MessageKey("WARNED_JOIN_START", 38, "warned_join", (CharSequence)(BlackHandler.c + "You have new warnings:"));
    public static final MessageKey az = new MessageKey("WARNED_JOIN_ENTRY", 39, "warned_join_entry", (CharSequence)(BlackHandler.F + " - Warned LiteBansModule_61 " + BlackHandler.c + "$executor" + BlackHandler.F + ": " + BlackHandler.c + "$reason\n   " + BlackHandler.F + "(" + BlackHandler.c + "$timeSince ago" + BlackHandler.F + ")"));
    public static final MessageKey bd = new MessageKey("NOTIFY", 40, "notify");
    public static final MessageKey LiteBansModule_240 = new MessageKey("NOTIFY_BANNED_PLAYER_JOIN", 41, bd, "banned_player_join", (CharSequence)(BlackHandler.c + "$player" + BlackHandler.Utf8Handler_2 + " tried to join, but is banned ($duration)!"));
    public static final MessageKey PlayerJoinListener = new MessageKey("NOTIFY_BANNED_BLACKLIST", 42, bd, "banned_geoip_blacklist", (CharSequence)(BlackHandler.c + "$player" + BlackHandler.Utf8Handler_2 + " tried to join, but is blacklisted ($geoip)!"));
    public static final MessageKey cZ = new MessageKey("ERROR_NO_PERMISSION", 43, "permission_error", (CharSequence)(BlackHandler.c + "You don'AsyncBackgroundTask_22 have permission!"));
    public static final MessageKey cm = new MessageKey("ERROR_NO_TEMPLATE", 44, "error_no_template_provided", (CharSequence)(BlackHandler.c + "You must provide BaseCoreGenericHandler template for this punishment!"));
    public static final MessageKey cl = new MessageKey("ERROR_NO_REASON", 45, "error_no_reason_provided", (CharSequence)(BlackHandler.c + "You must provide BaseCoreGenericHandler reason for this punishment!"));
    public static final MessageKey be = new MessageKey("ERROR_NO_REASON_REMOVAL", 46, "error_no_reason_removal", (CharSequence)(BlackHandler.c + "You must provide BaseCoreGenericHandler reason to remove this punishment!"));
    public static final MessageKey ServerEventListener = new MessageKey("ERROR_NO_DATABASE", 47, "error_no_sql_connection", (CharSequence)(BlackHandler.c + "LiteBans is not connected to BaseCoreGenericHandler database!"));
    public static final MessageKey aN = new MessageKey("ERROR_NO_UUID", 48, "error_no_uuid_found", (CharSequence)(BlackHandler.c + "Player does not "));
    public static final MessageKey aL = new MessageKey("ERROR_NO_DURATION", 49, "error_no_duration", (CharSequence)(BlackHandler.c + "No valid time specification detected!"));
    public static final MessageKey LiteBansModule_433 = new MessageKey("ERROR_STACK_OVERFLOW", 50, "error_stack_overflow", (CharSequence)(BlackHandler.c + "Stack overflow "));
    public static final MessageKey LiteBansModule_31 = new MessageKey("ERROR_CONSOLE", 51, "error_console_only", (CharSequence)(BlackHandler.c + "This command can only be used from "));
    public static final MessageKey g = new MessageKey("ERROR_DURATION_LIMIT", 52, "duration_limit_error", (CharSequence)(BlackHandler.c + "Maximum duration allowed: $duration"));
    public static final MessageKey LiteBansModule_67 = new MessageKey("ERROR_INTERNAL", 53, "internal_error", (CharSequence)(BlackHandler.c + "An internal error occurred while attempting to perform this "));
    public static final MessageKey cC = new MessageKey("BAN_USAGE", 54, BaseCoreGenericHandler, "usage", (CharSequence)(BlackHandler.c + "Usage: $command [-AsyncBackgroundTask_21] <player> [duration] [reason]"));
    public static final MessageKey LockdownCommandHandler = new MessageKey("BAN_EXAMPLE", 55, BaseCoreGenericHandler, "example", (CharSequence)(BlackHandler.c + "Example: $command Player 7d [reason]"));
    public static final MessageKey LiteBansModule_83 = new MessageKey("BAN_SILENT_PREFIX", 56, BaseCoreGenericHandler, "silent_prefix", (CharSequence)(BlackHandler.Utf8Handler_2 + "[" + BlackHandler.BroadcastService + "Silent" + BlackHandler.Utf8Handler_2 + "] "));
    public static final MessageKey LiteBansModule_77 = new MessageKey("BAN_BROADCAST", 57, BaseCoreGenericHandler, "broadcast_ban", (CharSequence)(BlackHandler.c("$executor ") + BlackHandler.Utf8Handler_2 + "banned " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey cp = new MessageKey("BAN_BROADCAST_TEMP", 58, BaseCoreGenericHandler, "broadcast_tempban", (CharSequence)(BlackHandler.c("$executor ") + BlackHandler.Utf8Handler_2 + "tempbanned " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for $tempDuration for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_6 = new MessageKey("BAN_BROADCAST_IP", 59, BaseCoreGenericHandler, "broadcast_ip_ban", (CharSequence)(BlackHandler.c("$executor ") + BlackHandler.Utf8Handler_2 + "IP-banned " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_2 = new MessageKey("BAN_BROADCAST_TEMP_IP", 60, BaseCoreGenericHandler, "broadcast_temp_ip_ban", (CharSequence)(BlackHandler.c("$executor ") + BlackHandler.Utf8Handler_2 + "temp IP-banned " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for $tempDuration for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey dB = new MessageKey("BAN_PREVIOUS_BAN_REMOVED", 61, BaseCoreGenericHandler, "previous_ban_removed", (CharSequence)BlackHandler.c("Previous ban for $playerName "));
    public static final MessageKey LiteBansModule_34 = new MessageKey("BAN_PREVIOUS_BAN_EXISTING", 62, BaseCoreGenericHandler, "previous_ban_existing", (CharSequence)BlackHandler.LiteBansModule_194("$playerName is already banned, and you do not have permission to replace existing "));
    public static final MessageKey SQLiteDriverHandler_2 = new MessageKey("BAN_ERROR_UNBAN_FAIL", 63, BaseCoreGenericHandler, "unban_fail", (CharSequence)BlackHandler.LiteBansModule_194("Target is not banned!"));
    public static final MessageKey ai = new MessageKey("BAN_ERROR_NO_OVERRIDE", 64, BaseCoreGenericHandler, "no_override", (CharSequence)BlackHandler.LiteBansModule_194("Player is already banned!"));
    public static final MessageKey LiteBansModule_117 = new MessageKey("BAN_ALTS_GUARDRAIL_DISCLAIMER", 65, BaseCoreGenericHandler, "alts_guardrail_disclaimer", (CharSequence)(BlackHandler.AsyncBackgroundTask_5("// WARNING WARNING WARNING WARNING WARNING //\n") + BlackHandler.g("Automatically banning accounts can result InitializerHandler_3 unintended and unexpected outcomes, such CommandExitException causing innocent players to be banned automatically.\n") + BlackHandler.g("If you want to enable this feature, please check and ensure the following:\n") + BlackHandler.LiteBansModule_194("1) Your players are not joining from BaseCoreGenericHandler limited range of IP addresses belonging to one specific host, such CommandExitException BaseCoreGenericHandler DDoS protection service forwarding players to your server.\n") + BlackHandler.LiteBansModule_194("2) All of your servers have IP forwarding set up correctly (please consult BungeeCord or Velocity documentation to set up IP forwarding, if you have not done so).\n") + BlackHandler.LiteBansModule_194("3) None of your user accounts are being randomly associated when checking /alts or /ipreport to view linked accounts on the same IP.\n") + BlackHandler.LiteBansModule_194("4) If you have HikariDataSource offline-mode network or permit non-premium users to join, please add your authentication or lobby server to ignored_iphistory_servers to prevent falsely associated accounts (since anyone can join any account).\n") + BlackHandler.AsyncBackgroundTask_5("// WARNING WARNING WARNING WARNING WARNING //\n") + BlackHandler.c("If you acknowledge and accept this disclaimer, please type " + BlackHandler.BaseCoreGenericHandler("litebans accept") + BlackHandler.c(" to enable automatic "))));
    public static final MessageKey aa = new MessageKey("BAN_ALTS_GUARDRAIL_BAN_SELF", 66, BaseCoreGenericHandler, "alts_guardrail_ban_self", (CharSequence)BlackHandler.LiteBansModule_194("Error: Banning associated accounts for $playerName would also ban your account!\nNo additional players will be "));
    public static final MessageKey U = new MessageKey("BAN_ALTS_GUARDRAIL_BAN_MANY", 67, BaseCoreGenericHandler, "alts_guardrail_ban_many", (CharSequence)BlackHandler.AsyncBackgroundTask_5("Warning: Banning this player will also ban $num players!\nThese players will be banned if you click here to confirm:\n$list\n {run: $command $commandArgs --confirm}"));
    public static final MessageKey LiteBansModule_105 = new MessageKey("BAN_EXEMPT", 68, BaseCoreGenericHandler, "exempt", (CharSequence)BlackHandler.LiteBansModule_194("You can'AsyncBackgroundTask_22 ban $player!"));
    public static final MessageKey LiteBansModule_36 = new MessageKey("BAN_COOLDOWN", 69, BaseCoreGenericHandler, "cooldown", (CharSequence)BlackHandler.LiteBansModule_194("You need to wait " + BlackHandler.AsyncBackgroundTask_5("$duration") + BlackHandler.LiteBansModule_194(" before you can use this command ")));
    public static final MessageKey D = new MessageKey("BAN_RESPONSE", 70, BaseCoreGenericHandler, "response", (CharSequence)"");
    public static final MessageKey cj = new MessageKey("BAN_MODIFY_SUCCESS", 71, BaseCoreGenericHandler, "modify_success", (CharSequence)BlackHandler.c("Punishment modified "));
    public static final MessageKey af = new MessageKey("BAN_DELETE_SUCCESS", 72, BaseCoreGenericHandler, "delete_success", (CharSequence)BlackHandler.c("Punishment deleted "));
    public static final MessageKey SecHandler = new MessageKey("BAN_HIDDEN_IP", 73, BaseCoreGenericHandler, "ip_hidden", (CharSequence)"[IP Address]");
    public static final MessageKey L = new MessageKey("UNBAN_USAGE", 74, BaseCoreGenericHandler, "unban_usage", (CharSequence)(BlackHandler.c + "Usage: $command <player>"));
    public static final MessageKey cO = new MessageKey("UNBAN_BROADCAST", 75, BaseCoreGenericHandler, "broadcast_unban", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "unbanned " + BlackHandler.i + "$playerName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$removalReason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_14 = new MessageKey("UNBAN_QUEUED", 76, BaseCoreGenericHandler, "unban_queued", (CharSequence)(BlackHandler.c + "Target is not banned!" + BlackHandler.m + " If they try to reconnect, they will be "));
    public static final MessageKey 0a000Handler = new MessageKey("MUTE_USAGE", 77, LiteBansModule_96, "usage", (CharSequence)(BlackHandler.c + "Usage: $command [-AsyncBackgroundTask_21] <player> [time spec] [reason]"));
    public static final MessageKey ah = new MessageKey("MUTE_EXAMPLE", 78, LiteBansModule_96, "example", (CharSequence)(BlackHandler.c + "Example: $command Player 7d [reason]"));
    public static final MessageKey ce = new MessageKey("MUTE_BROADCAST", 79, LiteBansModule_96, "broadcast", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "muted " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey dx = new MessageKey("MUTE_BROADCAST_TEMP", 80, LiteBansModule_96, "broadcast_tempmute", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "tempmuted " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for $tempDuration for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey m = new MessageKey("MUTE_BROADCAST_IP", 81, LiteBansModule_96, "broadcast_ip_mute", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "IP-muted " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey dq = new MessageKey("MUTE_BROADCAST_TEMP_IP", 82, LiteBansModule_96, "broadcast_temp_ip_mute", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "temp IP-muted " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for $tempDuration for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey e = new MessageKey("MUTE_MESSAGE", 83, LiteBansModule_96, "message", (CharSequence)(BlackHandler.F + "You have been muted LiteBansModule_61 $executor" + BlackHandler.F + " for " + BlackHandler.c + '\'' + BlackHandler.F + "$reason" + BlackHandler.c + "'" + BlackHandler.F + ".\n" + BlackHandler.F + "This mute will expire InitializerHandler_3 $"));
    public static final MessageKey dK = new MessageKey("MUTE_MESSAGE_PERMANENT", 84, LiteBansModule_96, "message_permanent", (CharSequence)(BlackHandler.F + "You have been permanently muted LiteBansModule_61 $executor" + BlackHandler.F + " for " + BlackHandler.c + '\'' + BlackHandler.F + "$reason" + BlackHandler.c + "'" + BlackHandler.F + ".\n" + BlackHandler.F + "This mute will not "));
    public static final MessageKey di = new MessageKey("MUTE_ERROR_UNMUTE_FAIL", 85, LiteBansModule_96, "unmute_fail", (CharSequence)(BlackHandler.c + "Target is not muted!"));
    public static final MessageKey LiteBansModule_5 = new MessageKey("MUTE_ERROR_NO_OVERRIDE", 86, LiteBansModule_96, "no_override", (CharSequence)(BlackHandler.c + "Player is already muted!"));
    public static final MessageKey ServerSyncService = new MessageKey("MUTE_PREVIOUS_MUTE_REMOVED", 87, LiteBansModule_96, "previous_mute_removed", (CharSequence)(BlackHandler.i + "Previous mute for $playerName "));
    public static final MessageKey SQLiteDriverHandler = new MessageKey("MUTE_PREVIOUS_MUTE_EXISTING", 88, LiteBansModule_96, "previous_mute_existing", (CharSequence)(BlackHandler.c + "$playerName is already muted, and you do not have permission to replace existing "));
    public static final MessageKey cY = new MessageKey("MUTE_EXEMPT", 89, LiteBansModule_96, "exempt", (CharSequence)(BlackHandler.c + "You can'AsyncBackgroundTask_22 mute $player!"));
    public static final MessageKey LiteBansModule_56 = new MessageKey("MUTE_NOTIFY", 90, LiteBansModule_96, "notification", (CharSequence)(BlackHandler.c + "$playerDisplayName tried to speak, but is "));
    public static final MessageKey LiteBansModule_134 = new MessageKey("MUTE_DISABLED", 91, LiteBansModule_96, "error_not_enabled", (CharSequence)(BlackHandler.c + "Muting is not enabled InitializerHandler_3 the configuration!"));
    public static final MessageKey dA = new MessageKey("MUTE_RESPONSE", 92, LiteBansModule_96, "response", (CharSequence)"");
    public static final MessageKey LiteBansModule_70 = new MessageKey("UNMUTE_USAGE", 93, LiteBansModule_96, "unmute_usage", (CharSequence)(BlackHandler.c + "Usage: $command <player>"));
    public static final MessageKey PlayerproviderHandler = new MessageKey("UNMUTE_BROADCAST", 94, LiteBansModule_96, "broadcast_unmute", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "unmuted " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$removalReason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_102 = new MessageKey("WARN_USAGE", 95, LiteBansModule_9, "usage", (CharSequence)(BlackHandler.c + "Usage: $command [-AsyncBackgroundTask_21] <player> [reason]"));
    public static final MessageKey NullHandler = new MessageKey("WARN_EXAMPLE", 96, LiteBansModule_9, "example", (CharSequence)"");
    public static final MessageKey LiteBansModule_104 = new MessageKey("WARN_BROADCAST", 97, LiteBansModule_9, "broadcast", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "warned " + BlackHandler.i + "$playerDisplayName " + BlackHandler.Utf8Handler_2 + "for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey Y = new MessageKey("WARN_MESSAGE", 98, LiteBansModule_9, "message", (CharSequence)(BlackHandler.F + "You have been warned LiteBansModule_61 $executor" + BlackHandler.F + " for " + BlackHandler.c + '\'' + BlackHandler.F + "$reason" + BlackHandler.c + '\'' + BlackHandler.F + ".\n" + BlackHandler.F + "This warning will expire InitializerHandler_3 $"));
    public static final MessageKey UsageHandler = new MessageKey("WARN_LIST_ENTRY", 99, LiteBansModule_9, "list_entry", (CharSequence)(BlackHandler.Utf8Handler_2 + " \\- Warned LiteBansModule_61 $executor: '$reason" + BlackHandler.Utf8Handler_2 + "'"));
    public static final MessageKey LiteBansModule_69 = new MessageKey("WARN_UNWARN_SUCCESS", 100, LiteBansModule_9, "unwarn_response", (CharSequence)(BlackHandler.i + "Last warning removed for $"));
    public static final MessageKey BuilderactionHandler = new MessageKey("WARN_ERROR_UNWARN_FAIL", 101, LiteBansModule_9, "unwarn_fail", (CharSequence)(BlackHandler.c + "Target has no warnings!"));
    public static final MessageKey aS = new MessageKey("WARN_EXEMPT", 102, LiteBansModule_9, "exempt", (CharSequence)(BlackHandler.c + "You can'AsyncBackgroundTask_22 warn $player!"));
    public static final MessageKey CommandExitException = new MessageKey("WARN_RESPONSE", 103, LiteBansModule_9, "response", (CharSequence)"");
    public static final MessageKey K = new MessageKey("UNWARN_USAGE", 104, LiteBansModule_9, "unwarn_usage", (CharSequence)(BlackHandler.c + "Usage: $command <player>"));
    public static final MessageKey ad = new MessageKey("UNWARN_BROADCAST", 105, LiteBansModule_9, "broadcast_unwarn", (CharSequence)(BlackHandler.i + "$executor " + BlackHandler.Utf8Handler_2 + "unwarned " + BlackHandler.i + "$playerDisplayName"));
    public static final MessageKey LiteBansModule_37 = new MessageKey("KICK_USAGE", 106, bk, "usage", (CharSequence)(BlackHandler.c + "$command <player> [reason]"));
    public static final MessageKey dL = new MessageKey("KICK_NO_MATCH", 107, bk, "no_match", (CharSequence)(BlackHandler.c + "Error: " + BlackHandler.F + "Player not "));
    public static final MessageKey dz = new MessageKey("KICK_REQUEST", 108, bk, "kick_requested", (CharSequence)(BlackHandler.m + "Player $player is not online on this server. Cross-server kick has been "));
    public static final MessageKey bf = new MessageKey("KICK_REASON", 109, bk, "message", (CharSequence)"Kicked LiteBansModule_61 $executor: $reason");
    public static final MessageKey InitializerHandler = new MessageKey("KICK_REASON_EMPTY", 110, bk, "message_no_reason", (CharSequence)"Kicked LiteBansModule_61 $");
    public static final MessageKey LiteBansModule_99 = new MessageKey("KICK_RESPONSE", 111, bk, "response", (CharSequence)(BlackHandler.m + "$playerDisplayName has been "));
    public static final MessageKey LiteBansModule_78 = new MessageKey("KICK_BROADCAST", 112, bk, "broadcast", (CharSequence)(BlackHandler.i + "$playerDisplayName" + BlackHandler.Utf8Handler_2 + " was kicked LiteBansModule_61 " + BlackHandler.i + "$executor" + BlackHandler.Utf8Handler_2 + " for '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + "' + "));
    public static final MessageKey LiteBansModule_4 = new MessageKey("KICK_BROADCAST_REASON_EMPTY", 113, bk, "broadcast_no_reason", (CharSequence)(BlackHandler.i + "$playerDisplayName" + BlackHandler.Utf8Handler_2 + " was kicked LiteBansModule_61 " + BlackHandler.i + "$executor" + BlackHandler.Utf8Handler_2 + '.'));
    public static final MessageKey T = new MessageKey("KICK_EXEMPT", 114, bk, "exempt", (CharSequence)(BlackHandler.c + "You can'AsyncBackgroundTask_22 kick $player!"));
    public static final MessageKey LiteBansModule_401 = new MessageKey("HISTORY_USAGE", 115, LiteBansModule_82, "usage", (CharSequence)(BlackHandler.c + "$command <player> [entries=10]"));
    public static final MessageKey GnuSparseMapHandler = new MessageKey("HISTORY_START", 116, LiteBansModule_82, "start", (CharSequence)(BlackHandler.i + "History for $target (Limit: $limit):"));
    public static final MessageKey B = new MessageKey("HISTORY_BAN", 117, LiteBansModule_82, "ban_entry", (CharSequence)(BlackHandler.i + " -- [" + BlackHandler.Utf8Handler_2 + "$timeSince ago" + BlackHandler.i + "] --" + BlackHandler.Utf8Handler_2 + "\n" + BlackHandler.Utf8Handler_2 + " $name was " + BlackHandler.c + "banned " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey ContinueEvictHandler = new MessageKey("HISTORY_MUTE", 118, LiteBansModule_82, "mute_entry", (CharSequence)(BlackHandler.i + " -- [" + BlackHandler.Utf8Handler_2 + "$timeSince ago" + BlackHandler.i + "] --" + BlackHandler.Utf8Handler_2 + "\n" + BlackHandler.Utf8Handler_2 + " $name was " + BlackHandler.BroadcastService + "muted " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey StringUtilities = new MessageKey("HISTORY_WARN", 119, LiteBansModule_82, "warn_entry", (CharSequence)(BlackHandler.i + " -- [" + BlackHandler.Utf8Handler_2 + "$timeSince ago" + BlackHandler.i + "] --" + BlackHandler.Utf8Handler_2 + "\n" + BlackHandler.Utf8Handler_2 + " $name was " + BlackHandler.m + "warned " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey cx = new MessageKey("HISTORY_KICK", 120, LiteBansModule_82, "kick_entry", (CharSequence)(BlackHandler.i + " -- [" + BlackHandler.Utf8Handler_2 + "$timeSince ago" + BlackHandler.i + "] --" + BlackHandler.Utf8Handler_2 + "\n" + BlackHandler.Utf8Handler_2 + " $name was " + BlackHandler.ServerSyncService + "kicked " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.i + "$reason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_93 = new MessageKey("HISTORY_UNBAN", 121, LiteBansModule_82, "unban_entry", (CharSequence)("\n " + BlackHandler.Utf8Handler_2 + "$name was " + BlackHandler.BroadcastService + "unbanned " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.BroadcastService + "$removalReason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey V = new MessageKey("HISTORY_UNMUTE", 122, LiteBansModule_82, "unmute_entry", (CharSequence)("\n " + BlackHandler.Utf8Handler_2 + "$name was " + BlackHandler.BroadcastService + "unmuted " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.BroadcastService + "$removalReason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey aG = new MessageKey("HISTORY_UNWARN", 123, LiteBansModule_82, "unwarn_entry", (CharSequence)("\n " + BlackHandler.Utf8Handler_2 + "$name was " + BlackHandler.BroadcastService + "unwarned " + BlackHandler.Utf8Handler_2 + "LiteBansModule_61 $executor: '" + BlackHandler.BroadcastService + "$removalReason" + BlackHandler.Utf8Handler_2 + '\''));
    public static final MessageKey LiteBansModule_89 = new MessageKey("HISTORY_SUFFIX_ACTIVE", 124, LiteBansModule_82, "active_suffix", (CharSequence)(BlackHandler.Utf8Handler_2 + " [" + BlackHandler.c + "Active" + BlackHandler.Utf8Handler_2 + ']'));
    public static final MessageKey MessageKey = new MessageKey("HISTORY_SUFFIX_ACTIVE_TEMP", 125, LiteBansModule_82, "active_suffix_temp", (CharSequence)(BlackHandler.Utf8Handler_2 + " [" + BlackHandler.c + "Active" + BlackHandler.Utf8Handler_2 + "]\n" + BlackHandler.Utf8Handler_2 + "Expires InitializerHandler_3 $"));
    public static final MessageKey dm = new MessageKey("HISTORY_SUFFIX_EXPIRED", 126, LiteBansModule_82, "expired_suffix", (CharSequence)(BlackHandler.Utf8Handler_2 + " [" + BlackHandler.g + "Expired" + BlackHandler.Utf8Handler_2 + ']'));
    public static final MessageKey LiteBansException = new MessageKey("HISTORY_ERROR_NO_LOGINRECORD", 127, LiteBansModule_82, "error_no_loginrecord", (CharSequence)(BlackHandler.c + "User has not joined "));
    public static final MessageKey LiteBansModule_17 = new MessageKey("HISTORY_ERROR_NO_USER", 128, LiteBansModule_82, "error_no_user", (CharSequence)(BlackHandler.c + "User not "));
    public static final MessageKey LiteBansModule_38 = new MessageKey("WARNINGS_USAGE", 129, LiteBansModule_107, "usage", (CharSequence)(BlackHandler.c + "$command <player>"));
    public static final MessageKey bc = new MessageKey("WARNINGS_START", 130, LiteBansModule_107, "start", (CharSequence)(BlackHandler.i + "Active warnings for $target:"));
    public static final MessageKey NullHandler_8 = new MessageKey("PRUNEHISTORY_USAGE", 131, LiteBansModule_71, "usage", (CharSequence)(BlackHandler.c + "$command <player> [duration]"));
    public static final MessageKey LiteBansModule_15 = new MessageKey("PRUNEHISTORY_MESSAGE", 132, LiteBansModule_71, "message", (CharSequence)(BlackHandler.i + "History "));
    public static final MessageKey PoolEntry = new MessageKey("STAFFHISTORY_USAGE", 133, LiteBansModule_132, "usage", (CharSequence)(BlackHandler.c + "$command <player> [entries=10]"));
    public static final MessageKey ax = new MessageKey("STAFFHISTORY_START", 134, LiteBansModule_132, "start", (CharSequence)(BlackHandler.i + "Staff history for $target (Limit: $limit):"));
    public static final MessageKey dE = new MessageKey("STAFFROLLBACK_USAGE", 135, bH, "usage", (CharSequence)(BlackHandler.c + "$command <player> [duration]"));
    public static final MessageKey LiteBansModule_64 = new MessageKey("STAFFROLLBACK_MESSAGE", 136, bH, "message", (CharSequence)(BlackHandler.i + "Rollback completed, total entries removed: $amount"));
    public static final MessageKey LiteBansModule_35 = new MessageKey("BANLIST_START", 137, W, "start", (CharSequence)(BlackHandler.Utf8Handler_2 + "=== " + BlackHandler.i + "Page " + BlackHandler.m + "$page" + BlackHandler.i + " out of " + BlackHandler.m + "$total" + BlackHandler.Utf8Handler_2 + " ==="));
    public static final MessageKey LiteBansModule_68 = new MessageKey("IPHISTORY_USAGE", 138, bZ, "usage", (CharSequence)(BlackHandler.c + "$command <player> [entries=10]"));
    public static final MessageKey ProxyResultSet = new MessageKey("IPHISTORY_START", 139, bZ, "start", (CharSequence)(BlackHandler.i + "Login history for $target (Limit: $limit):"));
    public static final MessageKey ac = new MessageKey("IPHISTORY_ENTRY", 140, bZ, "entry", (CharSequence)(BlackHandler.i + " - [" + BlackHandler.Utf8Handler_2 + "$date" + BlackHandler.i + ']' + BlackHandler.Utf8Handler_2 + " $name" + BlackHandler.i + ':' + BlackHandler.Utf8Handler_2 + " $ip"));
    public static final MessageKey PlayerQuitListener = new MessageKey("IPHISTORY_ERROR_NO_HISTORY", 141, bZ, "error_no_history", (CharSequence)(BlackHandler.c + "No history "));
    public static final MessageKey dH = new MessageKey("NAMEHISTORY_START", 142, bJ, "start", (CharSequence)(BlackHandler.i + "Name history for $target (Limit: $limit):"));
    public static final MessageKey ReaderHandler = new MessageKey("NAMEHISTORY_USAGE", 143, bJ, "usage", (CharSequence)(BlackHandler.c + "$command <player> [entries=10]"));
    public static final MessageKey SortHandler = new MessageKey("NAMEHISTORY_ENTRY", 144, bJ, "entry", (CharSequence)(BlackHandler.i + " - [" + BlackHandler.Utf8Handler_2 + "$playerLoginDate" + BlackHandler.i + ']' + BlackHandler.m + " $playerName"));
    public static final MessageKey LiteBansModule_29 = new MessageKey("DUPEIP_USAGE", 145, cN, "usage", (CharSequence)(BlackHandler.c + "$command <player>"));
    public static final MessageKey BanHandler_4 = new MessageKey("DUPEIP_START", 146, cN, "start", (CharSequence)(BlackHandler.Utf8Handler_2 + "Scanning " + BlackHandler.i + "$name" + BlackHandler.Utf8Handler_2 + " on " + BlackHandler.i + "$ip" + BlackHandler.Utf8Handler_2 + ".\n" + BlackHandler.Utf8Handler_2 + '[' + BlackHandler.i + "Online" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.BroadcastService + "Offline" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.c + "Banned" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.ServerSyncService + "IPBanned" + BlackHandler.Utf8Handler_2 + ']'));
    public static final MessageKey P = new MessageKey("DUPEIP_START_NO_IP", 147, cN, "start_no_ip", (CharSequence)(BlackHandler.Utf8Handler_2 + "Scanning " + BlackHandler.BroadcastService + "$name" + BlackHandler.Utf8Handler_2 + ".\n" + BlackHandler.Utf8Handler_2 + '[' + BlackHandler.i + "Online" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.BroadcastService + "Offline" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.c + "Banned" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.ServerSyncService + "IPBanned" + BlackHandler.Utf8Handler_2 + ']'));
    public static final MessageKey HikariPool = new MessageKey("DUPEIP_END", 148, cN, "end", (CharSequence)"");
    public static final MessageKey PoolBase = new MessageKey("DUPEIP_MULTIPLE_ADDRESSES", 149, cN, "multiple_addresses", (CharSequence)"[$num addresses]");
    public static final MessageKey ProxyConnection = new MessageKey("DUPEIP_SEPARATOR", 150, cN, "separator", (CharSequence)(BlackHandler.Utf8Handler_2 + ", "));
    public static final MessageKey BroadcastService = new MessageKey("DUPEIP_ONLINE", 151, cN, "online", (CharSequence)BlackHandler.i);
    public static final MessageKey n = new MessageKey("DUPEIP_OFFLINE", 152, cN, "offline", (CharSequence)BlackHandler.BroadcastService);
    public static final MessageKey DatabaseMonitorService = new MessageKey("DUPEIP_BANNED", 153, cN, "banned", (CharSequence)BlackHandler.c);
    public static final MessageKey cd = new MessageKey("DUPEIP_IP_BANNED", 154, cN, "ip_banned", (CharSequence)BlackHandler.ServerSyncService);
    public static final MessageKey PunishmentTableService = new MessageKey("DUPEIP_MUTED", 155, cN, "muted", (CharSequence)BlackHandler.m);
    public static final MessageKey LiteBansModule_32 = new MessageKey("IPREPORT_START", 156, LiteBansModule_140, "start", (CharSequence)(BlackHandler.Utf8Handler_2 + "Scanning " + BlackHandler.i + "$num" + BlackHandler.Utf8Handler_2 + " online players. + " + '[' + BlackHandler.i + "Online" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.BroadcastService + "Offline" + BlackHandler.Utf8Handler_2 + "] [" + BlackHandler.c + "Banned" + BlackHandler.Utf8Handler_2 + ']'));
    public static final MessageKey LiteBansModule_3 = new MessageKey("IPREPORT_ENTRY", 157, LiteBansModule_140, "entry", (CharSequence)(BlackHandler.Utf8Handler_2 + "$player" + BlackHandler.i + ": $result"));
    public static final MessageKey TapeHandler = new MessageKey("CHECKBAN_USAGE", 158, LiteBansModule_122, "usage", (CharSequence)(BlackHandler.c + "$command <player>"));
    public static final MessageKey LiteBansModule_13 = new MessageKey("CHECKBAN_NO_BAN", 159, LiteBansModule_122, "no_ban", (CharSequence)(BlackHandler.c + "Target is not banned!"));
    public static final MessageKey HoverTextFormatter = new MessageKey("CHECKBAN_BANNED", 160, LiteBansModule_122, "banned", (CharSequence)(BlackHandler.i + "Target " + BlackHandler.Utf8Handler_2 + '[' + BlackHandler.i + "$target" + BlackHandler.Utf8Handler_2 + ']' + BlackHandler.i + " is banned:\n" + BlackHandler.i + "Banned LiteBansModule_61: $executor\n" + BlackHandler.i + "Reason: $reason" + BlackHandler.i + "\n" + BlackHandler.i + "Banned on: $dateStart\n" + BlackHandler.i + "Banned until: $dateEnd ($duration)\n&aBanned on server &6&BaseCoreGenericHandler$serverOrigin&BaseCoreGenericHandler, server scope: &6$serverScope\n" + BlackHandler.i + "IP ban: $ipban, silent: $silent, permanent: $permanent"));
    public static final MessageKey LiteBansModule_27 = new MessageKey("CHECKMUTE_USAGE", 161, LiteBansModule_61, "usage", (CharSequence)(BlackHandler.c + "$command <player>"));
    public static final MessageKey LiteBansModule_23 = new MessageKey("CHECKMUTE_NO_MUTE", 162, LiteBansModule_61, "no_mute", (CharSequence)(BlackHandler.c + "Target is not muted!"));
    public static final MessageKey Utf8Handler = new MessageKey("CHECKMUTE_MUTED", 163, LiteBansModule_61, "muted", (CharSequence)(BlackHandler.i + "Target &LiteBansModule_194[&BaseCoreGenericHandler$target&LiteBansModule_194]&BaseCoreGenericHandler is muted:\n&aMuted LiteBansModule_61: $executor\n&aReason: $reason&r\n&aMuted on: $dateStart\n&aMuted until: $dateEnd ($duration)\n&aMuted on server &6$serverOrigin&BaseCoreGenericHandler, server scope: &6$serverScope\n&aIP mute: $ipban, silent: $silent, permanent: $permanent"));
    public static final MessageKey BanHandler_2 = new MessageKey("CHECKWARN_USAGE", 164, EventsHandler, "usage", (CharSequence)(BlackHandler.c + "$command <player>"));
    public static final MessageKey AsyncBackgroundTask_8 = new MessageKey("CHECKWARN_NO_WARN", 165, EventsHandler, "no_warn", (CharSequence)(BlackHandler.c + "Target is not warned!"));
    public static final MessageKey SelectorHandler = new MessageKey("CHECKWARN_WARNED", 166, EventsHandler, "warned", (CharSequence)(BlackHandler.i + "Target &LiteBansModule_194[&BaseCoreGenericHandler$target&LiteBansModule_194]&BaseCoreGenericHandler is warned:\n&aWarned LiteBansModule_61: $executor\n&aReason: $reason&r\n&aWarned on: $dateStart\n&aWarned until: $dateEnd ($duration)\n&aWarned on server &6$serverOrigin&BaseCoreGenericHandler, server scope: &6$serverScope\n&aIP warning: $ipban, silent: $silent, permanent: $permanent"));
    public static final MessageKey HikariDataSource = new MessageKey("LASTUUID_USAGE", 167, dg, "usage", (CharSequence)(BlackHandler.c + "$command <player|IP>"));
    public static final MessageKey bI = new MessageKey("LASTUUID_MESSAGE", 168, dg, "message", (CharSequence)(BlackHandler.Utf8Handler_2 + "Last UUID for " + BlackHandler.i + "$name" + BlackHandler.Utf8Handler_2 + ": " + BlackHandler.i + "$uuid"));
    public static final MessageKey cq = new MessageKey("GEOIP_USAGE", 169, LiteBansModule_12, "usage", (CharSequence)(BlackHandler.c + "$command <player|IP>"));
    public static final MessageKey AsyncBackgroundTask_21 = new MessageKey("GEOIP_MESSAGE", 170, LiteBansModule_12, "message", (CharSequence)(BlackHandler.i + "$target" + BlackHandler.Utf8Handler_2 + " is from: " + BlackHandler.i + "$result"));
    public static final MessageKey cF = new MessageKey("GEOIP_DISABLED", 171, LiteBansModule_12, "error_disabled", (CharSequence)(BlackHandler.c + "GeoIP support is not enabled InitializerHandler_3 the configuration!"));
    public static final MessageKey ck = new MessageKey("GEOIP_UNAVAILABLE", 172, LiteBansModule_12, "error_unavailable", (CharSequence)(BlackHandler.c + "GeoIP support is currently unavailable, has UpdateCheckTask been downloaded yet?"));
    public static final MessageKey CommandExecutionTask = new MessageKey("GEOIP_NONE_FOUND", 173, LiteBansModule_12, "error_not_found", (CharSequence)(BlackHandler.c + "GeoIP information for $target not "));
    public static final MessageKey cG = new MessageKey("LOCKDOWN_USAGE", 174, BanHandler_5, "usage", (CharSequence)(BlackHandler.c + "$command <reason> | $command end"));
    public static final MessageKey bV = new MessageKey("LOCKDOWN_MESSAGE", 175, BanHandler_5, "message", (CharSequence)(BlackHandler.c + "Server lockdown activated (reason: \"$reason" + BlackHandler.c + "\")"));
    public static final MessageKey X = new MessageKey("LOCKDOWN_END", 176, BanHandler_5, "stopped", (CharSequence)(BlackHandler.i + "Lockdown has been "));
    public static final MessageKey LiteBansModule_24 = new MessageKey("LOCKDOWN_KICK_MESSAGE", 177, BanHandler_5, "kick_message", (CharSequence)"Server lockdown active, try again later.\\nReason: $reason");
    public static final MessageKey LiteBansModule_141 = new MessageKey("LOCKDOWN_KICK_MESSAGE_GLOBAL", 178, BanHandler_5, "kick_message_global", (CharSequence)"Network lockdown active, try again later.\\nReason: $reason");
    public static final MessageKey c = new MessageKey("LOCKDOWN_ERROR_NOT_ACTIVE", 179, BanHandler_5, "error_not_active", (CharSequence)(BlackHandler.c + "Lockdown is not active!"));
    public static final MessageKey aW = new MessageKey("RELOAD_SUCCESS", 180, i, "reload_success", (CharSequence)(BlackHandler.i + "LiteBans reloaded "));
    public static final MessageKey ar = new MessageKey("RELOAD_FAIL", 181, i, "reload_fail", (CharSequence)(BlackHandler.c + "Reload "));
    public static final MessageKey bM = new MessageKey("RELOAD_FAIL_CONNECT", 182, i, "reload_fail_connect", (CharSequence)(BlackHandler.i + "Litebans " + BlackHandler.c + "Failed to connect to "));
    public static final MessageKey ProxyPreparedStatement = new MessageKey("RELOAD_FAIL_CONFIG", 183, i, "reload_fail_config", (CharSequence)(BlackHandler.c + "[LiteBans] " + BlackHandler.F + "config.yml is not valid and could not be loaded, the default configuration will be used.\\n" + BlackHandler.c + "Please check the server console for more "));
    public static final MessageKey PropertyHandler = new MessageKey("RELOAD_FAIL_CONFIG_MESSAGES", 184, i, "reload_fail_messages", (CharSequence)(BlackHandler.c + "[LiteBans] " + BlackHandler.F + "messages.yml is not valid and could not be loaded, default messages will be used.\\n" + BlackHandler.c + "Please check the server console for more "));
    public static final MessageKey aV = new MessageKey("RELOAD_FAIL_CONFIG_TEMPLATES", 185, i, "reload_fail_templates", (CharSequence)(BlackHandler.c + "[LiteBans] " + BlackHandler.F + "templates.yml is not valid and could not be loaded. Configured templates will be unavailable until this has been fixed.\\n" + BlackHandler.c + "Please check the server console for more "));
    public static final MessageKey ValueHandler = new MessageKey("FIXHISTORY_START", 186, i, "fix_history", (CharSequence)(BlackHandler.i + "Fixing history for table $table.. + "));
    public static final MessageKey LiteBansModule_65 = new MessageKey("FIXHISTORY_END", 187, i, "fix_history_result", (CharSequence)(BlackHandler.i + "Added $amount "));
    public static final MessageKey LiteBansModule_25 = new MessageKey("FIXHISTORY_OFFLINE_UUIDS", 188, i, "fix_history_offline_uuids", (CharSequence)(BlackHandler.c + "$amount UUIDs were not fetched from Mojang since they are offline-mode "));
    public static final MessageKey LiteBansException_2 = new MessageKey("IMPORT_USAGE", 189, i, "import_usage", (CharSequence)(BlackHandler.c + "$command import start"));
    public static final MessageKey aO = new MessageKey("IMPORT_START", 190, i, "import_start", (CharSequence)(BlackHandler.i + "Importing from $LiteBansModule_116, this might take BaseCoreGenericHandler while.. + "));
    public static final MessageKey ValueHandler_2 = new MessageKey("IMPORT_FINISH", 191, i, "import_finish", (CharSequence)(BlackHandler.i + "Import finished successfully. $bans bans imported, $ipbans IP-"));
    public static final MessageKey LiteBansModule_87 = new MessageKey("IMPORT_FINISH_LITEBANS", 192, i, "import_finish_litebans", (CharSequence)(BlackHandler.i + "Import finished successfully. Added $amount entries to the "));
    public static final MessageKey LiteBansModule_40 = new MessageKey("IMPORT_FAIL", 193, i, "import_fail", (CharSequence)(BlackHandler.c + "Import failed. Check "));
    public static final MessageKey GeoIPLookupService = new MessageKey("IMPORT_UNSUPPORTED", 194, i, "import_unsupported", (CharSequence)(BlackHandler.c + "Importing from '$name' is not supported yet!"));
    public static final MessageKey flag = new MessageKey("ALLOW_USAGE", 195, i, "allow_usage", (CharSequence)(BlackHandler.c + "Usage: /litebans allow <add/remove/check> <user>"));
    public static final MessageKey ElementHandler = new MessageKey("ALLOW_ADDED", 196, i, "allow_added", (CharSequence)(BlackHandler.ServerSyncService + "Player " + BlackHandler.m + "$playerName" + BlackHandler.ServerSyncService + " has been " + BlackHandler.i + "allowed to join the server" + BlackHandler.ServerSyncService + " + "));
    public static final MessageKey LiteBansModule_73 = new MessageKey("ALLOW_REMOVED", 197, i, "allow_removed", (CharSequence)(BlackHandler.ServerSyncService + "Player " + BlackHandler.m + "$playerName" + BlackHandler.ServerSyncService + " has been " + BlackHandler.c + "removed from the allow list" + BlackHandler.ServerSyncService + " + "));
    public static final MessageKey bq = new MessageKey("ALLOW_CHECK_TRUE", 198, i, "allow_check_true", (CharSequence)(BlackHandler.i + "Player " + BlackHandler.m + "$playerName" + BlackHandler.i + " is allowed to join the "));
    public static final MessageKey bO = new MessageKey("ALLOW_CHECK_FALSE", 199, i, "allow_check_false", (CharSequence)(BlackHandler.c + "Player " + BlackHandler.m + "$playerName" + BlackHandler.c + " is not allowed to join the "));
    public static final MessageKey LiteBansModule_75 = new MessageKey("ALLOW_ERROR_ADD", 200, i, "allow_error_add", (CharSequence)(BlackHandler.c + "Error: $playerName is already allowed to join the "));
    public static final MessageKey ExceptionHandler = new MessageKey("ALLOW_ERROR_REMOVE", 201, i, "allow_error_remove", (CharSequence)(BlackHandler.c + "Error: $playerName is not allowed to join the "));
    public static final MessageKey dj = new MessageKey("RESET_DATABASE_CONFIRM", 202, i, "reset_database_confirm_quoted", (CharSequence)("\n" + BlackHandler.c + "WARNING: " + BlackHandler.ServerSyncService + "This command will reset your database, removing all active and inactive punishments permanently.\n" + BlackHandler.c + "WARNING: " + BlackHandler.r + "This operation is irreversible without restoring BaseCoreGenericHandler database backup.\n" + BlackHandler.ServerSyncService + "Run '" + BlackHandler.c + "litebans $commandArgs confirm" + BlackHandler.ServerSyncService + "' to "));
    public static final MessageKey LiteBansModule_39 = new MessageKey("RESET_DATABASE_RESULT", 203, i, "reset_database_result", (CharSequence)(BlackHandler.i + "Removed " + BlackHandler.ServerSyncService + "$amount " + BlackHandler.i + "$type from " + BlackHandler.ServerSyncService + "server:$serverScope" + BlackHandler.i + " + "));
    public static final MessageKey TempHandler = new MessageKey("DURATION", 204, "duration");
    public static final MessageKey HikariConfig = new MessageKey("EXPIRED", 205, TempHandler, "expired", (CharSequence)"expired");
    public static final MessageKey LiteBansModule_60 = new MessageKey("FOREVER", 206, TempHandler, "forever", (CharSequence)"forever");
    public static final MessageKey AsyncBackgroundTask_6 = new MessageKey("YEAR", 207, TempHandler, "year", (CharSequence)"year");
    public static final MessageKey q = new MessageKey("YEARS", 208, TempHandler, "years", (CharSequence)"years");
    public static final MessageKey LiteBansModule_10 = new MessageKey("MONTH", 209, TempHandler, "month", (CharSequence)"month");
    public static final MessageKey aT = new MessageKey("MONTHS", 210, TempHandler, "months", (CharSequence)"months");
    public static final MessageKey ElementsHandler_3 = new MessageKey("WEEK", 211, TempHandler, "week", (CharSequence)"week");
    public static final MessageKey aU = new MessageKey("WEEKS", 212, TempHandler, "weeks", (CharSequence)"weeks");
    public static final MessageKey LiteBansModule_125 = new MessageKey("DAY", 213, TempHandler, "day", (CharSequence)"day");
    public static final MessageKey aq = new MessageKey("DAYS", 214, TempHandler, "days", (CharSequence)"days");
    public static final MessageKey cH = new MessageKey("HOUR", 215, TempHandler, "hour", (CharSequence)"hour");
    public static final MessageKey SetHandler = new MessageKey("HOURS", 216, TempHandler, "hours", (CharSequence)"hours");
    public static final MessageKey r = new MessageKey("MINUTE", 217, TempHandler, "minute", (CharSequence)"minute");
    public static final MessageKey cB = new MessageKey("MINUTES", 218, TempHandler, "minutes", (CharSequence)"minutes");
    public static final MessageKey dC = new MessageKey("SECOND", 219, TempHandler, "second", (CharSequence)"second");
    public static final MessageKey bu = new MessageKey("SECONDS", 220, TempHandler, "seconds", (CharSequence)"seconds");
    public static final MessageKey InputHandler = new MessageKey("DURATION_FORMAT", 221, TempHandler, "format", (CharSequence)"%AsyncBackgroundTask_5 %AsyncBackgroundTask_21");
    public static final MessageKey S = new MessageKey("DURATION_SEPARATOR", 222, TempHandler, "separator", (CharSequence)", ");
    public static final MessageKey bG = new MessageKey("STRINGS", 223, "strings");
    public static final MessageKey LiteBansModule_7 = new MessageKey("STRINGS_GLOBAL", 224, bG, "global", (CharSequence)"global");
    public static final MessageKey ay = new MessageKey("STRINGS_NULL", 225, bG, "null", (CharSequence)"undefined");
    public static final MessageKey ap = new MessageKey("STRINGS_TRUE", 226, bG, "true", (CharSequence)"yes");
    public static final MessageKey OutHandler = new MessageKey("STRINGS_FALSE", 227, bG, "false", (CharSequence)"no");
    public static final MessageKey O = new MessageKey("WEB", 228, "webhook");
    public static final MessageKey cw = new MessageKey("WEB_EVENT", 229, O, "events");
    public static final MessageKey bR = new MessageKey("WEB_BAN", 230, cw, "embed_ban");
    public static final MessageKey bp = new MessageKey("WEB_BAN_TITLE", 231, bR, "title", (CharSequence)"Banned");
    public static final MessageKey LiteBansModule_45 = new MessageKey("WEB_BAN_COLOR", 232, bR, "color", (CharSequence)"#CC2200");
    public static final MessageKey H = new MessageKey("WEB_BAN_CONTENT", 233, bR, "content", (CharSequence)"$playerName has been banned!\n\u2022 Banned LiteBansModule_61: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final MessageKey LiteBansModule_33 = new MessageKey("WEB_BAN_FIELDS", 234, bR, "fields", (CharSequence)"");
    public static final MessageKey bB = new MessageKey("WEB_BAN_THUMB", 235, bR, "thumbnail", (CharSequence)"");
    public static final MessageKey cv = new MessageKey("WEB_UNBAN", 236, cw, "embed_unban");
    public static final MessageKey BanHandler = new MessageKey("WEB_UNBAN_TITLE", 237, cv, "title", (CharSequence)"Unbanned");
    public static final MessageKey LiteBansModule_44 = new MessageKey("WEB_UNBAN_COLOR", 238, cv, "color", (CharSequence)"#727374");
    public static final MessageKey InitHandler = new MessageKey("WEB_UNBAN_CONTENT", 239, cv, "content", (CharSequence)"$playerName has been unbanned!\n\u2022 Unbanned LiteBansModule_61: $executor\n\u2022 Reason: $removalReason");
    public static final MessageKey ProxyStatement = new MessageKey("WEB_UNBAN_FIELDS", 240, cv, "fields", (CharSequence)"");
    public static final MessageKey A = new MessageKey("WEB_UNBAN_THUMB", 241, cv, "thumbnail", (CharSequence)"");
    public static final MessageKey LiteBansModule_18 = new MessageKey("WEB_MUTE", 242, cw, "embed_mute");
    public static final MessageKey ab = new MessageKey("WEB_MUTE_TITLE", 243, LiteBansModule_18, "title", (CharSequence)"Muted");
    public static final MessageKey LiteBansModule_109 = new MessageKey("WEB_MUTE_COLOR", 244, LiteBansModule_18, "color", (CharSequence)"#BB9000");
    public static final MessageKey ba = new MessageKey("WEB_MUTE_CONTENT", 245, LiteBansModule_18, "content", (CharSequence)"$playerName has been muted!\n\u2022 Muted LiteBansModule_61: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final MessageKey LiteBansModule_194 = new MessageKey("WEB_MUTE_FIELDS", 246, LiteBansModule_18, "fields", (CharSequence)"");
    public static final MessageKey LiteBansModule_127 = new MessageKey("WEB_MUTE_THUMB", 247, LiteBansModule_18, "thumbnail", (CharSequence)"");
    public static final MessageKey bw = new MessageKey("WEB_UNMUTE", 248, cw, "embed_unmute");
    public static final MessageKey aE = new MessageKey("WEB_UNMUTE_TITLE", 249, bw, "title", (CharSequence)"Unmuted");
    public static final MessageKey J = new MessageKey("WEB_UNMUTE_COLOR", 250, bw, "color", (CharSequence)"#727374");
    public static final MessageKey cT = new MessageKey("WEB_UNMUTE_CONTENT", 251, bw, "content", (CharSequence)"$playerName has been unmuted!\n\u2022 Unmuted LiteBansModule_61: $executor\n\u2022 Reason: $removalReason");
    public static final MessageKey cS = new MessageKey("WEB_UNMUTE_FIELDS", 252, bw, "fields", (CharSequence)"");
    public static final MessageKey NanHandler = new MessageKey("WEB_UNMUTE_THUMB", 253, bw, "thumbnail", (CharSequence)"");
    public static final MessageKey aM = new MessageKey("WEB_WARN", 254, cw, "embed_warn");
    public static final MessageKey LiteBansModule_43 = new MessageKey("WEB_WARN_TITLE", 255, aM, "title", (CharSequence)"Warned");
    public static final MessageKey dD = new MessageKey("WEB_WARN_COLOR", 256, aM, "color", (CharSequence)"#FFAA11");
    public static final MessageKey bY = new MessageKey("WEB_WARN_CONTENT", 257, aM, "content", (CharSequence)"$playerName has been warned!\n\u2022 Warned LiteBansModule_61: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final MessageKey LiteBansModule_80 = new MessageKey("WEB_WARN_FIELDS", 258, aM, "fields", (CharSequence)"");
    public static final MessageKey LiteBansModule_430 = new MessageKey("WEB_WARN_THUMB", 259, aM, "thumbnail", (CharSequence)"");
    public static final MessageKey dn = new MessageKey("WEB_UNWARN", 260, cw, "embed_unwarn");
    public static final MessageKey NoneHandler_2 = new MessageKey("WEB_UNWARN_TITLE", 261, dn, "title", (CharSequence)"Unwarned");
    public static final MessageKey ci = new MessageKey("WEB_UNWARN_COLOR", 262, dn, "color", (CharSequence)"#727374");
    public static final MessageKey ElementsHandler = new MessageKey("WEB_UNWARN_CONTENT", 263, dn, "content", (CharSequence)"$playerName has been unwarned!\n\u2022 Unwarned LiteBansModule_61: $executor\n\u2022 Reason: $removalReason");
    public static final MessageKey PunishmentService = new MessageKey("WEB_UNWARN_FIELDS", 264, dn, "fields", (CharSequence)"");
    public static final MessageKey AsyncBackgroundTask_7 = new MessageKey("WEB_UNWARN_THUMB", 265, dn, "thumbnail", (CharSequence)"");
    public static final MessageKey z = new MessageKey("WEB_KICK", 266, cw, "embed_kick");
    public static final MessageKey bx = new MessageKey("WEB_KICK_TITLE", 267, z, "title", (CharSequence)"Kicked");
    public static final MessageKey LiteBansModule_91 = new MessageKey("WEB_KICK_COLOR", 268, z, "color", (CharSequence)"#999900");
    public static final MessageKey dt = new MessageKey("WEB_KICK_CONTENT", 269, z, "content", (CharSequence)"$playerName has been kicked!\n\u2022 Kicked LiteBansModule_61: $executor\n\u2022 Reason: $reason");
    public static final MessageKey LiteBansModule_100 = new MessageKey("WEB_KICK_FIELDS", 270, z, "fields", (CharSequence)"");
    public static final MessageKey bn = new MessageKey("WEB_KICK_THUMB", 271, z, "thumbnail", (CharSequence)"");
    public static final MessageKey LitebansNotifyHandler = new MessageKey("WEB_ALTS", 272, cw, "embed_alts");
    public static final MessageKey bt = new MessageKey("WEB_ALTS_TITLE", 273, LitebansNotifyHandler, "title", (CharSequence)"Scanned $playerName");
    public static final MessageKey ca = new MessageKey("WEB_ALTS_COLOR", 274, LitebansNotifyHandler, "color", (CharSequence)"#999999");
    public static final MessageKey HistoryCleanupTask = new MessageKey("WEB_ALTS_THUMB", 275, LitebansNotifyHandler, "thumbnail", (CharSequence)"");
    public final String PluginHookService;
    public @Nullable CharSequence ServerOriginHandler;
    private static final /* synthetic */ MessageKey[] AsyncBackgroundTask_22;

    public static MessageKey[] values() {
        return (MessageKey[])AsyncBackgroundTask_22.clone();
    }

    public static MessageKey BaseCoreGenericHandler(String string) {
        return Enum.valueOf(MessageKey.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private MessageKey() {
        this((String)var1_-1, (int)var2_-1, (MessageKey)var3_1, (String)var4_2, null);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MessageKey(@Nullable CharSequence charSequence) {
        this((String)var1_-1, (int)var2_-1, ((MessageKey)charSequence).BaseCoreGenericHandler() + '.' + (String)var4_2, (CharSequence)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MessageKey() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.PluginHookService = var3_1;
    }

    /*
     * WARNING - void declaration
     */
    private MessageKey() {
        this((String)var1_-1, (int)var2_-1, (String)var3_1);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.plugin((CharSequence)var4_2);
    }

    public static String BaseCoreGenericHandler(Object object, boolean flag, boolean flag2) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof CharSequence) {
            return object.toString();
        }
        if (object instanceof Character) {
            return new String(new char[]{((Character)object).charValue()});
        }
        if (flag) {
            if (flag2) {
                return object.toString().trim();
            }
            return object.toString();
        }
        return null;
    }

    public static MessageKey c(String string) {
        string = string.toUpperCase(Locale.ROOT);
        for (MessageKey am2 : litebans.MessageKey.values()) {
            if (!am2.name().equals(string)) continue;
            return am2;
        }
        throw new AssertionError((Object)string);
    }

    public static String LiteBansModule_31(String string) {
        return litebans.MessageKey.c(string).toString();
    }

    public static @NotNull CharSequence BaseCoreGenericHandler(@NotNull BanHandler a_2) {
        switch (a_2.c()) {
            case LiteBansModule_240: {
                return B;
            }
            case GnuSparseMapHandler: {
                return ContinueEvictHandler;
            }
            case c: {
                return StringUtilities;
            }
            case g: {
                return cx;
            }
        }
        throw new AssertionError();
    }

    public static @NotNull String BaseCoreGenericHandler(CharSequence charSequence, boolean flag) {
        String string = BlackHandler.BaseCoreGenericHandler('&', charSequence.toString().replace("\\n", "\n"));
        if (flag) {
            string = litebans.HoverTextFormatter.LiteBansModule_31.BaseCoreGenericHandler(string);
        }
        if (string.contains("\n{hoverText:")) {
            string = string.replace("\n{hoverText:", "\n {hoverText:");
        }
        if (string.contains("\n{run:")) {
            string = string.replace("\n{run:", "\n {run:");
        }
        if (string.contains("\n{url:")) {
            string = string.replace("\n{url:", "\n {url:");
        }
        return string;
    }

    public static @Nullable String BaseCoreGenericHandler(MessageKey am2, @Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!am2.PluginHookService.startsWith("webhook") && charSequence.toString().contains("#$SQLiteDriverHandler_4")) {
            charSequence = charSequence.toString().replace("#$SQLiteDriverHandler_4", "#&LiteBansModule_31$SQLiteDriverHandler_4");
        }
        return litebans.GeoIPLookupService.BaseCoreGenericHandler(charSequence);
    }

    public String BaseCoreGenericHandler(String string, @Nullable Object object) {
        return this.plugin(litebans.GeoIPLookupService.c(string), object);
    }

    public String LiteBansModule_31(CharSequence charSequence) {
        return this + "\n" + charSequence;
    }

    @Override
    public char charAt(int n) {
        if (this.ServerOriginHandler == null) {
            return '?';
        }
        return this.ServerOriginHandler.charAt(n);
    }

    public boolean isEmpty() {
        return this.length() == 0;
    }

    @Override
    public int length() {
        if (this.ServerOriginHandler == null) {
            return 0;
        }
        return this.ServerOriginHandler.length();
    }

    public @NotNull String BaseCoreGenericHandler(CharSequence charSequence, @Nullable Object object) {
        Object object2 = object;
        if (object2 == null) {
            object2 = "";
        }
        return this.ServerOriginHandler.toString().replace(charSequence.toString(), object2.toString());
    }

    public void BaseCoreGenericHandler(@Nullable CharSequence charSequence) {
        String string = charSequence == null ? null : litebans.MessageKey.BaseCoreGenericHandler(charSequence.toString(), false);
        string = litebans.MessageKey.BaseCoreGenericHandler(this, string);
        this.ServerOriginHandler = string;
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.ServerOriginHandler.subSequence(n, n2);
    }

    @Override
    public String toString() {
        return String.valueOf(this.ServerOriginHandler);
    }

    public String BaseCoreGenericHandler() {
        return this.PluginHookService;
    }

    private static final /* synthetic */ MessageKey[] LiteBansModule_31() {
        return new MessageKey[]{LiteBansModule_21, BaseCoreGenericHandler, LiteBansModule_96, LiteBansModule_9, bk, LiteBansModule_82, LiteBansModule_132, LiteBansModule_107, LiteBansModule_71, bH, W, bZ, bJ, cN, LiteBansModule_140, LiteBansModule_122, LiteBansModule_61, EventsHandler, dg, BanHandler_5, LiteBansModule_12, i, LiteBansModule_50, LiteBansModule, Utf8Handler_2, LiteBansModule_118, df, LockdownService, cu, LiteBansModule_66, bS, F, CommandThrottleService, LiteBansModule_116, AsyncBackgroundTask_5, aj, ak, AsyncBackgroundTask, du, az, bd, LiteBansModule_240, PlayerJoinListener, cZ, cm, cl, be, ServerEventListener, aN, aL, LiteBansModule_433, LiteBansModule_31, g, LiteBansModule_67, cC, LockdownCommandHandler, LiteBansModule_83, LiteBansModule_77, cp, LiteBansModule_6, LiteBansModule_2, dB, LiteBansModule_34, SQLiteDriverHandler_2, ai, LiteBansModule_117, aa, U, LiteBansModule_105, LiteBansModule_36, D, cj, af, SecHandler, L, cO, LiteBansModule_14, 0a000Handler, ah, ce, dx, m, dq, e, dK, di, LiteBansModule_5, ServerSyncService, SQLiteDriverHandler, cY, LiteBansModule_56, LiteBansModule_134, dA, LiteBansModule_70, PlayerproviderHandler, LiteBansModule_102, NullHandler, LiteBansModule_104, Y, UsageHandler, LiteBansModule_69, BuilderactionHandler, aS, CommandExitException, K, ad, LiteBansModule_37, dL, dz, bf, InitializerHandler, LiteBansModule_99, LiteBansModule_78, LiteBansModule_4, T, LiteBansModule_401, GnuSparseMapHandler, B, ContinueEvictHandler, StringUtilities, cx, LiteBansModule_93, V, aG, LiteBansModule_89, MessageKey, dm, LiteBansException, LiteBansModule_17, LiteBansModule_38, bc, NullHandler_8, LiteBansModule_15, PoolEntry, ax, dE, LiteBansModule_64, LiteBansModule_35, LiteBansModule_68, ProxyResultSet, ac, PlayerQuitListener, dH, ReaderHandler, SortHandler, LiteBansModule_29, BanHandler_4, P, HikariPool, PoolBase, ProxyConnection, BroadcastService, n, DatabaseMonitorService, cd, PunishmentTableService, LiteBansModule_32, LiteBansModule_3, TapeHandler, LiteBansModule_13, HoverTextFormatter, LiteBansModule_27, LiteBansModule_23, Utf8Handler, BanHandler_2, AsyncBackgroundTask_8, SelectorHandler, HikariDataSource, bI, cq, AsyncBackgroundTask_21, cF, ck, CommandExecutionTask, cG, bV, X, LiteBansModule_24, LiteBansModule_141, c, aW, ar, bM, ProxyPreparedStatement, PropertyHandler, aV, ValueHandler, LiteBansModule_65, LiteBansModule_25, LiteBansException_2, aO, ValueHandler_2, LiteBansModule_87, LiteBansModule_40, GeoIPLookupService, flag, ElementHandler, LiteBansModule_73, bq, bO, LiteBansModule_75, ExceptionHandler, dj, LiteBansModule_39, TempHandler, HikariConfig, LiteBansModule_60, AsyncBackgroundTask_6, q, LiteBansModule_10, aT, ElementsHandler_3, aU, LiteBansModule_125, aq, cH, SetHandler, r, cB, dC, bu, InputHandler, S, bG, LiteBansModule_7, ay, ap, OutHandler, O, cw, bR, bp, LiteBansModule_45, H, LiteBansModule_33, bB, cv, BanHandler, LiteBansModule_44, InitHandler, ProxyStatement, A, LiteBansModule_18, ab, LiteBansModule_109, ba, LiteBansModule_194, LiteBansModule_127, bw, aE, J, cT, cS, NanHandler, aM, LiteBansModule_43, dD, bY, LiteBansModule_80, LiteBansModule_430, dn, NoneHandler_2, ci, ElementsHandler, PunishmentService, AsyncBackgroundTask_7, z, bx, LiteBansModule_91, dt, LiteBansModule_100, bn, LitebansNotifyHandler, bt, ca, HistoryCleanupTask};
    }

    static {
        AsyncBackgroundTask_22 = litebans.MessageKey.LiteBansModule_31();
    }
}

