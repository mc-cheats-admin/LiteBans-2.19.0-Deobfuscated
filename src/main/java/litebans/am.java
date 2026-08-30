package litebans;

import java.util.Locale;
import litebans.a_;
import litebans.bF;
import litebans.hd_0;
import litebans.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class am
extends Enum
implements CharSequence {
    public static final am at = new am("CMD", 0, "command");
    public static final am a = new am("C_BAN", 1, at, "ban");
    public static final am cQ = new am("C_MUTE", 2, at, "mute");
    public static final am aC = new am("C_WARN", 3, at, "warn");
    public static final am bk = new am("C_KICK", 4, at, "kick");
    public static final am ch = new am("C_HISTORY", 5, at, "history");
    public static final am dp = new am("C_STAFFHISTORY", 6, at, "staffhistory");
    public static final am cX = new am("C_WARNINGS", 7, at, "warnings");
    public static final am c_ = new am("C_PRUNEHISTORY", 8, at, "prunehistory");
    public static final am bH = new am("C_STAFFROLLBACK", 9, at, "staffrollback");
    public static final am W = new am("C_BANLIST", 10, at, "banlist");
    public static final am bZ = new am("C_IPHISTORY", 11, at, "iphistory");
    public static final am bJ = new am("C_NAMEHISTORY", 12, at, "namehistory");
    public static final am cN = new am("C_DUPEIP", 13, at, "dupeip");
    public static final am dv = new am("C_IPREPORT", 14, at, "ipreport");
    public static final am dG = new am("C_CHECKBAN", 15, at, "checkban");
    public static final am by = new am("C_CHECKMUTE", 16, at, "checkmute");
    public static final am cb = new am("C_CHECKWARN", 17, at, "checkwarn");
    public static final am dg = new am("C_LASTUUID", 18, at, "lastuuid");
    public static final am I = new am("C_LOCKDOWN", 19, at, "lockdown");
    public static final am ag = new am("C_GEOIP", 20, at, "geoip");
    public static final am i = new am("C_LITEBANS", 21, at, "litebans");
    public static final am bK = new am("HEX_FORMATS", 22, "hex_formats", (CharSequence)"&%s\n<%s>\n{%s}");
    public static final am a0 = new am("DATE_FORMAT", 23, "time_format", (CharSequence)"yyyy-MM-dd");
    public static final am k = new am("DEFAULT_BAN_REASON", 24, "default_ban_reason", (CharSequence)"The Ban Hammer has spoken!");
    public static final am dd = new am("DEFAULT_MUTE_REASON", 25, "default_mute_reason", (CharSequence)"Spamming");
    public static final am df = new am("DEFAULT_UNBAN_REASON", 26, "default_unban_reason", (CharSequence)"No reason specified.");
    public static final am R = new am("DEFAULT_UNMUTE_REASON", 27, "default_unmute_reason", (CharSequence)"No reason specified.");
    public static final am cu = new am("DEFAULT_UNWARN_REASON", 28, "default_unwarn_reason", (CharSequence)"No reason specified.");
    public static final am c5 = new am("BANNED_MESSAGE_BASE", 29, "banned_message_base", (CharSequence)(hd_0.c + "You are banned from this server!" + hd_0.k + "\n\nBanned on: $dateStart\nBanned by: $executor\nReason: $reason" + hd_0.k + '\n'));
    public static final am bS = new am("BANNED_MESSAGE", 30, "banned_message", (CharSequence)"$base\nExpires in: $duration\n$appealMessage");
    public static final am F = new am("BANNED_MESSAGE_PERMANENT", 31, "banned_message_permanent", (CharSequence)"$base\nYou are permanently banned!\n$appealMessage");
    public static final am v = new am("BANNED_MESSAGE_APPEAL", 32, "banned_message_appeal_message", (CharSequence)"");
    public static final am db = new am("BANNED_MESSAGE_GEOIP", 33, "banned_message_geoip_blacklist", (CharSequence)(hd_0.c + "You are banned from this server!" + hd_0.k + "\n\nYour location is blacklisted: $geoip"));
    public static final am d = new am("BANNED_MESSAGE_SWITCH", 34, "proxy_switch_banned", (CharSequence)(hd_0.c + "You are banned on $serverScope! Reason:\n$reason"));
    public static final am aj = new am("BANNED_MESSAGE_SWITCH_TEMP", 35, "proxy_switch_tempbanned", (CharSequence)(hd_0.c + "You are banned on $serverScope! Reason:\n$reason\nExpires in: $duration"));
    public static final am ak = new am("MUTED", 36, "muted", (CharSequence)(hd_0.c + "You are muted! ($duration remaining)!\n" + hd_0.c + "Reason: " + hd_0.u + "$reason"));
    public static final am bj = new am("MUTED_PERMANENT", 37, "muted_permanent", (CharSequence)(hd_0.c + "You are permanently muted!\n" + hd_0.c + "Reason: " + hd_0.u + "$reason"));
    public static final am du = new am("WARNED_JOIN_START", 38, "warned_join", (CharSequence)(hd_0.c + "You have new warnings:"));
    public static final am az = new am("WARNED_JOIN_ENTRY", 39, "warned_join_entry", (CharSequence)(hd_0.F + " - Warned by " + hd_0.c + "$executor" + hd_0.F + ": " + hd_0.c + "$reason\n   " + hd_0.F + "(" + hd_0.c + "$timeSince ago" + hd_0.F + ")"));
    public static final am bd = new am("NOTIFY", 40, "notify");
    public static final am h = new am("NOTIFY_BANNED_PLAYER_JOIN", 41, bd, "banned_player_join", (CharSequence)(hd_0.c + "$player" + hd_0.k + " tried to join, but is banned ($duration)!"));
    public static final am dy = new am("NOTIFY_BANNED_BLACKLIST", 42, bd, "banned_geoip_blacklist", (CharSequence)(hd_0.c + "$player" + hd_0.k + " tried to join, but is blacklisted ($geoip)!"));
    public static final am cZ = new am("ERROR_NO_PERMISSION", 43, "permission_error", (CharSequence)(hd_0.c + "You don't have permission!"));
    public static final am cm = new am("ERROR_NO_TEMPLATE", 44, "error_no_template_provided", (CharSequence)(hd_0.c + "You must provide a template for this punishment!"));
    public static final am cl = new am("ERROR_NO_REASON", 45, "error_no_reason_provided", (CharSequence)(hd_0.c + "You must provide a reason for this punishment!"));
    public static final am be = new am("ERROR_NO_REASON_REMOVAL", 46, "error_no_reason_removal", (CharSequence)(hd_0.c + "You must provide a reason to remove this punishment!"));
    public static final am aX = new am("ERROR_NO_DATABASE", 47, "error_no_sql_connection", (CharSequence)(hd_0.c + "LiteBans is not connected to a database!"));
    public static final am aN = new am("ERROR_NO_UUID", 48, "error_no_uuid_found", (CharSequence)(hd_0.c + "Player does not exist."));
    public static final am aL = new am("ERROR_NO_DURATION", 49, "error_no_duration", (CharSequence)(hd_0.c + "No valid time specification detected!"));
    public static final am x = new am("ERROR_STACK_OVERFLOW", 50, "error_stack_overflow", (CharSequence)(hd_0.c + "Stack overflow detected."));
    public static final am b = new am("ERROR_CONSOLE", 51, "error_console_only", (CharSequence)(hd_0.c + "This command can only be used from console."));
    public static final am g = new am("ERROR_DURATION_LIMIT", 52, "duration_limit_error", (CharSequence)(hd_0.c + "Maximum duration allowed: $duration"));
    public static final am c6 = new am("ERROR_INTERNAL", 53, "internal_error", (CharSequence)(hd_0.c + "An internal error occurred while attempting to perform this command."));
    public static final am cC = new am("BAN_USAGE", 54, a, "usage", (CharSequence)(hd_0.c + "Usage: $command [-s] <player> [duration] [reason]"));
    public static final am aP = new am("BAN_EXAMPLE", 55, a, "example", (CharSequence)(hd_0.c + "Example: $command Player 7d [reason]"));
    public static final am cI = new am("BAN_SILENT_PREFIX", 56, a, "silent_prefix", (CharSequence)(hd_0.k + "[" + hd_0.o + "Silent" + hd_0.k + "] "));
    public static final am cE = new am("BAN_BROADCAST", 57, a, "broadcast_ban", (CharSequence)(hd_0.c("$executor ") + hd_0.k + "banned " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am cp = new am("BAN_BROADCAST_TEMP", 58, a, "broadcast_tempban", (CharSequence)(hd_0.c("$executor ") + hd_0.k + "tempbanned " + hd_0.i + "$playerDisplayName " + hd_0.k + "for $tempDuration for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am a9 = new am("BAN_BROADCAST_IP", 59, a, "broadcast_ip_ban", (CharSequence)(hd_0.c("$executor ") + hd_0.k + "IP-banned " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am a1 = new am("BAN_BROADCAST_TEMP_IP", 60, a, "broadcast_temp_ip_ban", (CharSequence)(hd_0.c("$executor ") + hd_0.k + "temp IP-banned " + hd_0.i + "$playerDisplayName " + hd_0.k + "for $tempDuration for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am dB = new am("BAN_PREVIOUS_BAN_REMOVED", 61, a, "previous_ban_removed", (CharSequence)hd_0.c("Previous ban for $playerName removed."));
    public static final am b3 = new am("BAN_PREVIOUS_BAN_EXISTING", 62, a, "previous_ban_existing", (CharSequence)hd_0.f("$playerName is already banned, and you do not have permission to replace existing bans."));
    public static final am cJ = new am("BAN_ERROR_UNBAN_FAIL", 63, a, "unban_fail", (CharSequence)hd_0.f("Target is not banned!"));
    public static final am ai = new am("BAN_ERROR_NO_OVERRIDE", 64, a, "no_override", (CharSequence)hd_0.f("Player is already banned!"));
    public static final am dc = new am("BAN_ALTS_GUARDRAIL_DISCLAIMER", 65, a, "alts_guardrail_disclaimer", (CharSequence)(hd_0.d("// WARNING WARNING WARNING WARNING WARNING //\n") + hd_0.g("Automatically banning accounts can result in unintended and unexpected outcomes, such as causing innocent players to be banned automatically.\n") + hd_0.g("If you want to enable this feature, please check and ensure the following:\n") + hd_0.f("1) Your players are not joining from a limited range of IP addresses belonging to one specific host, such as a DDoS protection service forwarding players to your server.\n") + hd_0.f("2) All of your servers have IP forwarding set up correctly (please consult BungeeCord or Velocity documentation to set up IP forwarding, if you have not done so).\n") + hd_0.f("3) None of your user accounts are being randomly associated when checking /alts or /ipreport to view linked accounts on the same IP.\n") + hd_0.f("4) If you have an offline-mode network or permit non-premium users to join, please add your authentication or lobby server to ignored_iphistory_servers to prevent falsely associated accounts (since anyone can join any account).\n") + hd_0.d("// WARNING WARNING WARNING WARNING WARNING //\n") + hd_0.c("If you acknowledge and accept this disclaimer, please type " + hd_0.a("litebans accept") + hd_0.c(" to enable automatic bans."))));
    public static final am aa = new am("BAN_ALTS_GUARDRAIL_BAN_SELF", 66, a, "alts_guardrail_ban_self", (CharSequence)hd_0.f("Error: Banning associated accounts for $playerName would also ban your account!\nNo additional players will be banned."));
    public static final am U = new am("BAN_ALTS_GUARDRAIL_BAN_MANY", 67, a, "alts_guardrail_ban_many", (CharSequence)hd_0.d("Warning: Banning this player will also ban $num players!\nThese players will be banned if you click here to confirm:\n$list\n {run: $command $commandArgs --confirm}"));
    public static final am cW = new am("BAN_EXEMPT", 68, a, "exempt", (CharSequence)hd_0.f("You can't ban $player!"));
    public static final am b5 = new am("BAN_COOLDOWN", 69, a, "cooldown", (CharSequence)hd_0.f("You need to wait " + hd_0.d("$duration") + hd_0.f(" before you can use this command again.")));
    public static final am D = new am("BAN_RESPONSE", 70, a, "response", (CharSequence)"");
    public static final am cj = new am("BAN_MODIFY_SUCCESS", 71, a, "modify_success", (CharSequence)hd_0.c("Punishment modified successfully."));
    public static final am af = new am("BAN_DELETE_SUCCESS", 72, a, "delete_success", (CharSequence)hd_0.c("Punishment deleted successfully."));
    public static final am dk = new am("BAN_HIDDEN_IP", 73, a, "ip_hidden", (CharSequence)"[IP Address]");
    public static final am L = new am("UNBAN_USAGE", 74, a, "unban_usage", (CharSequence)(hd_0.c + "Usage: $command <player>"));
    public static final am cO = new am("UNBAN_BROADCAST", 75, a, "broadcast_unban", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "unbanned " + hd_0.i + "$playerName " + hd_0.k + "for '" + hd_0.i + "$removalReason" + hd_0.k + '\''));
    public static final am aJ = new am("UNBAN_QUEUED", 76, a, "unban_queued", (CharSequence)(hd_0.c + "Target is not banned!" + hd_0.m + " If they try to reconnect, they will be unbanned."));
    public static final am c2 = new am("MUTE_USAGE", 77, cQ, "usage", (CharSequence)(hd_0.c + "Usage: $command [-s] <player> [time spec] [reason]"));
    public static final am ah = new am("MUTE_EXAMPLE", 78, cQ, "example", (CharSequence)(hd_0.c + "Example: $command Player 7d [reason]"));
    public static final am ce = new am("MUTE_BROADCAST", 79, cQ, "broadcast", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "muted " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am dx = new am("MUTE_BROADCAST_TEMP", 80, cQ, "broadcast_tempmute", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "tempmuted " + hd_0.i + "$playerDisplayName " + hd_0.k + "for $tempDuration for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am m = new am("MUTE_BROADCAST_IP", 81, cQ, "broadcast_ip_mute", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "IP-muted " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am dq = new am("MUTE_BROADCAST_TEMP_IP", 82, cQ, "broadcast_temp_ip_mute", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "temp IP-muted " + hd_0.i + "$playerDisplayName " + hd_0.k + "for $tempDuration for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am e = new am("MUTE_MESSAGE", 83, cQ, "message", (CharSequence)(hd_0.F + "You have been muted by $executor" + hd_0.F + " for " + hd_0.c + '\'' + hd_0.F + "$reason" + hd_0.c + "'" + hd_0.F + ".\n" + hd_0.F + "This mute will expire in $duration."));
    public static final am dK = new am("MUTE_MESSAGE_PERMANENT", 84, cQ, "message_permanent", (CharSequence)(hd_0.F + "You have been permanently muted by $executor" + hd_0.F + " for " + hd_0.c + '\'' + hd_0.F + "$reason" + hd_0.c + "'" + hd_0.F + ".\n" + hd_0.F + "This mute will not expire."));
    public static final am di = new am("MUTE_ERROR_UNMUTE_FAIL", 85, cQ, "unmute_fail", (CharSequence)(hd_0.c + "Target is not muted!"));
    public static final am a8 = new am("MUTE_ERROR_NO_OVERRIDE", 86, cQ, "no_override", (CharSequence)(hd_0.c + "Player is already muted!"));
    public static final am u = new am("MUTE_PREVIOUS_MUTE_REMOVED", 87, cQ, "previous_mute_removed", (CharSequence)(hd_0.i + "Previous mute for $playerName removed."));
    public static final am aR = new am("MUTE_PREVIOUS_MUTE_EXISTING", 88, cQ, "previous_mute_existing", (CharSequence)(hd_0.c + "$playerName is already muted, and you do not have permission to replace existing mutes."));
    public static final am cY = new am("MUTE_EXEMPT", 89, cQ, "exempt", (CharSequence)(hd_0.c + "You can't mute $player!"));
    public static final am bP = new am("MUTE_NOTIFY", 90, cQ, "notification", (CharSequence)(hd_0.c + "$playerDisplayName tried to speak, but is muted."));
    public static final am ds = new am("MUTE_DISABLED", 91, cQ, "error_not_enabled", (CharSequence)(hd_0.c + "Muting is not enabled in the configuration!"));
    public static final am dA = new am("MUTE_RESPONSE", 92, cQ, "response", (CharSequence)"");
    public static final am c9 = new am("UNMUTE_USAGE", 93, cQ, "unmute_usage", (CharSequence)(hd_0.c + "Usage: $command <player>"));
    public static final am a2 = new am("UNMUTE_BROADCAST", 94, cQ, "broadcast_unmute", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "unmuted " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$removalReason" + hd_0.k + '\''));
    public static final am cU = new am("WARN_USAGE", 95, aC, "usage", (CharSequence)(hd_0.c + "Usage: $command [-s] <player> [reason]"));
    public static final am a6 = new am("WARN_EXAMPLE", 96, aC, "example", (CharSequence)"");
    public static final am cV = new am("WARN_BROADCAST", 97, aC, "broadcast", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "warned " + hd_0.i + "$playerDisplayName " + hd_0.k + "for '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am Y = new am("WARN_MESSAGE", 98, aC, "message", (CharSequence)(hd_0.F + "You have been warned by $executor" + hd_0.F + " for " + hd_0.c + '\'' + hd_0.F + "$reason" + hd_0.c + '\'' + hd_0.F + ".\n" + hd_0.F + "This warning will expire in $duration."));
    public static final am bC = new am("WARN_LIST_ENTRY", 99, aC, "list_entry", (CharSequence)(hd_0.k + " \\- Warned by $executor: '$reason" + hd_0.k + "'"));
    public static final am c8 = new am("WARN_UNWARN_SUCCESS", 100, aC, "unwarn_response", (CharSequence)(hd_0.i + "Last warning removed for $player."));
    public static final am a5 = new am("WARN_ERROR_UNWARN_FAIL", 101, aC, "unwarn_fail", (CharSequence)(hd_0.c + "Target has no warnings!"));
    public static final am aS = new am("WARN_EXEMPT", 102, aC, "exempt", (CharSequence)(hd_0.c + "You can't warn $player!"));
    public static final am as = new am("WARN_RESPONSE", 103, aC, "response", (CharSequence)"");
    public static final am K = new am("UNWARN_USAGE", 104, aC, "unwarn_usage", (CharSequence)(hd_0.c + "Usage: $command <player>"));
    public static final am ad = new am("UNWARN_BROADCAST", 105, aC, "broadcast_unwarn", (CharSequence)(hd_0.i + "$executor " + hd_0.k + "unwarned " + hd_0.i + "$playerDisplayName"));
    public static final am b6 = new am("KICK_USAGE", 106, bk, "usage", (CharSequence)(hd_0.c + "$command <player> [reason]"));
    public static final am dL = new am("KICK_NO_MATCH", 107, bk, "no_match", (CharSequence)(hd_0.c + "Error: " + hd_0.F + "Player not found."));
    public static final am dz = new am("KICK_REQUEST", 108, bk, "kick_requested", (CharSequence)(hd_0.m + "Player $player is not online on this server. Cross-server kick has been requested."));
    public static final am bf = new am("KICK_REASON", 109, bk, "message", (CharSequence)"Kicked by $executor: $reason");
    public static final am bm = new am("KICK_REASON_EMPTY", 110, bk, "message_no_reason", (CharSequence)"Kicked by $executor.");
    public static final am cs = new am("KICK_RESPONSE", 111, bk, "response", (CharSequence)(hd_0.m + "$playerDisplayName has been kicked."));
    public static final am cf = new am("KICK_BROADCAST", 112, bk, "broadcast", (CharSequence)(hd_0.i + "$playerDisplayName" + hd_0.k + " was kicked by " + hd_0.i + "$executor" + hd_0.k + " for '" + hd_0.i + "$reason" + hd_0.k + "'."));
    public static final am a7 = new am("KICK_BROADCAST_REASON_EMPTY", 113, bk, "broadcast_no_reason", (CharSequence)(hd_0.i + "$playerDisplayName" + hd_0.k + " was kicked by " + hd_0.i + "$executor" + hd_0.k + '.'));
    public static final am T = new am("KICK_EXEMPT", 114, bk, "exempt", (CharSequence)(hd_0.c + "You can't kick $player!"));
    public static final am l = new am("HISTORY_USAGE", 115, ch, "usage", (CharSequence)(hd_0.c + "$command <player> [entries=10]"));
    public static final am j = new am("HISTORY_START", 116, ch, "start", (CharSequence)(hd_0.i + "History for $target (Limit: $limit):"));
    public static final am B = new am("HISTORY_BAN", 117, ch, "ban_entry", (CharSequence)(hd_0.i + " -- [" + hd_0.k + "$timeSince ago" + hd_0.i + "] --" + hd_0.k + "\n" + hd_0.k + " $name was " + hd_0.c + "banned " + hd_0.k + "by $executor: '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am aD = new am("HISTORY_MUTE", 118, ch, "mute_entry", (CharSequence)(hd_0.i + " -- [" + hd_0.k + "$timeSince ago" + hd_0.i + "] --" + hd_0.k + "\n" + hd_0.k + " $name was " + hd_0.o + "muted " + hd_0.k + "by $executor: '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am bz = new am("HISTORY_WARN", 119, ch, "warn_entry", (CharSequence)(hd_0.i + " -- [" + hd_0.k + "$timeSince ago" + hd_0.i + "] --" + hd_0.k + "\n" + hd_0.k + " $name was " + hd_0.m + "warned " + hd_0.k + "by $executor: '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am cx = new am("HISTORY_KICK", 120, ch, "kick_entry", (CharSequence)(hd_0.i + " -- [" + hd_0.k + "$timeSince ago" + hd_0.i + "] --" + hd_0.k + "\n" + hd_0.k + " $name was " + hd_0.u + "kicked " + hd_0.k + "by $executor: '" + hd_0.i + "$reason" + hd_0.k + '\''));
    public static final am co = new am("HISTORY_UNBAN", 121, ch, "unban_entry", (CharSequence)("\n " + hd_0.k + "$name was " + hd_0.o + "unbanned " + hd_0.k + "by $executor: '" + hd_0.o + "$removalReason" + hd_0.k + '\''));
    public static final am V = new am("HISTORY_UNMUTE", 122, ch, "unmute_entry", (CharSequence)("\n " + hd_0.k + "$name was " + hd_0.o + "unmuted " + hd_0.k + "by $executor: '" + hd_0.o + "$removalReason" + hd_0.k + '\''));
    public static final am aG = new am("HISTORY_UNWARN", 123, ch, "unwarn_entry", (CharSequence)("\n " + hd_0.k + "$name was " + hd_0.o + "unwarned " + hd_0.k + "by $executor: '" + hd_0.o + "$removalReason" + hd_0.k + '\''));
    public static final am cM = new am("HISTORY_SUFFIX_ACTIVE", 124, ch, "active_suffix", (CharSequence)(hd_0.k + " [" + hd_0.c + "Active" + hd_0.k + ']'));
    public static final am am = new am("HISTORY_SUFFIX_ACTIVE_TEMP", 125, ch, "active_suffix_temp", (CharSequence)(hd_0.k + " [" + hd_0.c + "Active" + hd_0.k + "]\n" + hd_0.k + "Expires in $duration."));
    public static final am dm = new am("HISTORY_SUFFIX_EXPIRED", 126, ch, "expired_suffix", (CharSequence)(hd_0.k + " [" + hd_0.g + "Expired" + hd_0.k + ']'));
    public static final am bi = new am("HISTORY_ERROR_NO_LOGINRECORD", 127, ch, "error_no_loginrecord", (CharSequence)(hd_0.c + "User has not joined before."));
    public static final am al = new am("HISTORY_ERROR_NO_USER", 128, ch, "error_no_user", (CharSequence)(hd_0.c + "User not found."));
    public static final am b7 = new am("WARNINGS_USAGE", 129, cX, "usage", (CharSequence)(hd_0.c + "$command <player>"));
    public static final am bc = new am("WARNINGS_START", 130, cX, "start", (CharSequence)(hd_0.i + "Active warnings for $target:"));
    public static final am Z = new am("PRUNEHISTORY_USAGE", 131, c_, "usage", (CharSequence)(hd_0.c + "$command <player> [duration]"));
    public static final am aK = new am("PRUNEHISTORY_MESSAGE", 132, c_, "message", (CharSequence)(hd_0.i + "History pruned."));
    public static final am dI = new am("STAFFHISTORY_USAGE", 133, dp, "usage", (CharSequence)(hd_0.c + "$command <player> [entries=10]"));
    public static final am ax = new am("STAFFHISTORY_START", 134, dp, "start", (CharSequence)(hd_0.i + "Staff history for $target (Limit: $limit):"));
    public static final am dE = new am("STAFFROLLBACK_USAGE", 135, bH, "usage", (CharSequence)(hd_0.c + "$command <player> [duration]"));
    public static final am c0 = new am("STAFFROLLBACK_MESSAGE", 136, bH, "message", (CharSequence)(hd_0.i + "Rollback completed, total entries removed: $amount"));
    public static final am b4 = new am("BANLIST_START", 137, W, "start", (CharSequence)(hd_0.k + "=== " + hd_0.i + "Page " + hd_0.m + "$page" + hd_0.i + " out of " + hd_0.m + "$total" + hd_0.k + " ==="));
    public static final am c7 = new am("IPHISTORY_USAGE", 138, bZ, "usage", (CharSequence)(hd_0.c + "$command <player> [entries=10]"));
    public static final am bX = new am("IPHISTORY_START", 139, bZ, "start", (CharSequence)(hd_0.i + "Login history for $target (Limit: $limit):"));
    public static final am ac = new am("IPHISTORY_ENTRY", 140, bZ, "entry", (CharSequence)(hd_0.i + " - [" + hd_0.k + "$date" + hd_0.i + ']' + hd_0.k + " $name" + hd_0.i + ':' + hd_0.k + " $ip"));
    public static final am M = new am("IPHISTORY_ERROR_NO_HISTORY", 141, bZ, "error_no_history", (CharSequence)(hd_0.c + "No history found."));
    public static final am dH = new am("NAMEHISTORY_START", 142, bJ, "start", (CharSequence)(hd_0.i + "Name history for $target (Limit: $limit):"));
    public static final am b1 = new am("NAMEHISTORY_USAGE", 143, bJ, "usage", (CharSequence)(hd_0.c + "$command <player> [entries=10]"));
    public static final am br = new am("NAMEHISTORY_ENTRY", 144, bJ, "entry", (CharSequence)(hd_0.i + " - [" + hd_0.k + "$playerLoginDate" + hd_0.i + ']' + hd_0.m + " $playerName"));
    public static final am aZ = new am("DUPEIP_USAGE", 145, cN, "usage", (CharSequence)(hd_0.c + "$command <player>"));
    public static final am G = new am("DUPEIP_START", 146, cN, "start", (CharSequence)(hd_0.k + "Scanning " + hd_0.i + "$name" + hd_0.k + " on " + hd_0.i + "$ip" + hd_0.k + ".\n" + hd_0.k + '[' + hd_0.i + "Online" + hd_0.k + "] [" + hd_0.o + "Offline" + hd_0.k + "] [" + hd_0.c + "Banned" + hd_0.k + "] [" + hd_0.u + "IPBanned" + hd_0.k + ']'));
    public static final am P = new am("DUPEIP_START_NO_IP", 147, cN, "start_no_ip", (CharSequence)(hd_0.k + "Scanning " + hd_0.o + "$name" + hd_0.k + ".\n" + hd_0.k + '[' + hd_0.i + "Online" + hd_0.k + "] [" + hd_0.o + "Offline" + hd_0.k + "] [" + hd_0.c + "Banned" + hd_0.k + "] [" + hd_0.u + "IPBanned" + hd_0.k + ']'));
    public static final am dr = new am("DUPEIP_END", 148, cN, "end", (CharSequence)"");
    public static final am cR = new am("DUPEIP_MULTIPLE_ADDRESSES", 149, cN, "multiple_addresses", (CharSequence)"[$num addresses]");
    public static final am bN = new am("DUPEIP_SEPARATOR", 150, cN, "separator", (CharSequence)(hd_0.k + ", "));
    public static final am o = new am("DUPEIP_ONLINE", 151, cN, "online", (CharSequence)hd_0.i);
    public static final am n = new am("DUPEIP_OFFLINE", 152, cN, "offline", (CharSequence)hd_0.o);
    public static final am w = new am("DUPEIP_BANNED", 153, cN, "banned", (CharSequence)hd_0.c);
    public static final am cd = new am("DUPEIP_IP_BANNED", 154, cN, "ip_banned", (CharSequence)hd_0.u);
    public static final am p = new am("DUPEIP_MUTED", 155, cN, "muted", (CharSequence)hd_0.m);
    public static final am b0 = new am("IPREPORT_START", 156, dv, "start", (CharSequence)(hd_0.k + "Scanning " + hd_0.i + "$num" + hd_0.k + " online players.. " + '[' + hd_0.i + "Online" + hd_0.k + "] [" + hd_0.o + "Offline" + hd_0.k + "] [" + hd_0.c + "Banned" + hd_0.k + ']'));
    public static final am a4 = new am("IPREPORT_ENTRY", 157, dv, "entry", (CharSequence)(hd_0.k + "$player" + hd_0.i + ": $result"));
    public static final am ao = new am("CHECKBAN_USAGE", 158, dG, "usage", (CharSequence)(hd_0.c + "$command <player>"));
    public static final am aH = new am("CHECKBAN_NO_BAN", 159, dG, "no_ban", (CharSequence)(hd_0.c + "Target is not banned!"));
    public static final am y = new am("CHECKBAN_BANNED", 160, dG, "banned", (CharSequence)(hd_0.i + "Target " + hd_0.k + '[' + hd_0.i + "$target" + hd_0.k + ']' + hd_0.i + " is banned:\n" + hd_0.i + "Banned by: $executor\n" + hd_0.i + "Reason: $reason" + hd_0.i + "\n" + hd_0.i + "Banned on: $dateStart\n" + hd_0.i + "Banned until: $dateEnd ($duration)\n&aBanned on server &6&a$serverOrigin&a, server scope: &6$serverScope\n" + hd_0.i + "IP ban: $ipban, silent: $silent, permanent: $permanent"));
    public static final am aY = new am("CHECKMUTE_USAGE", 161, by, "usage", (CharSequence)(hd_0.c + "$command <player>"));
    public static final am au = new am("CHECKMUTE_NO_MUTE", 162, by, "no_mute", (CharSequence)(hd_0.c + "Target is not muted!"));
    public static final am c4 = new am("CHECKMUTE_MUTED", 163, by, "muted", (CharSequence)(hd_0.i + "Target &f[&a$target&f]&a is muted:\n&aMuted by: $executor\n&aReason: $reason&r\n&aMuted on: $dateStart\n&aMuted until: $dateEnd ($duration)\n&aMuted on server &6$serverOrigin&a, server scope: &6$serverScope\n&aIP mute: $ipban, silent: $silent, permanent: $permanent"));
    public static final am C = new am("CHECKWARN_USAGE", 164, cb, "usage", (CharSequence)(hd_0.c + "$command <player>"));
    public static final am dl = new am("CHECKWARN_NO_WARN", 165, cb, "no_warn", (CharSequence)(hd_0.c + "Target is not warned!"));
    public static final am bv = new am("CHECKWARN_WARNED", 166, cb, "warned", (CharSequence)(hd_0.i + "Target &f[&a$target&f]&a is warned:\n&aWarned by: $executor\n&aReason: $reason&r\n&aWarned on: $dateStart\n&aWarned until: $dateEnd ($duration)\n&aWarned on server &6$serverOrigin&a, server scope: &6$serverScope\n&aIP warning: $ipban, silent: $silent, permanent: $permanent"));
    public static final am an = new am("LASTUUID_USAGE", 167, dg, "usage", (CharSequence)(hd_0.c + "$command <player|IP>"));
    public static final am bI = new am("LASTUUID_MESSAGE", 168, dg, "message", (CharSequence)(hd_0.k + "Last UUID for " + hd_0.i + "$name" + hd_0.k + ": " + hd_0.i + "$uuid"));
    public static final am cq = new am("GEOIP_USAGE", 169, ag, "usage", (CharSequence)(hd_0.c + "$command <player|IP>"));
    public static final am s = new am("GEOIP_MESSAGE", 170, ag, "message", (CharSequence)(hd_0.i + "$target" + hd_0.k + " is from: " + hd_0.i + "$result"));
    public static final am cF = new am("GEOIP_DISABLED", 171, ag, "error_disabled", (CharSequence)(hd_0.c + "GeoIP support is not enabled in the configuration!"));
    public static final am ck = new am("GEOIP_UNAVAILABLE", 172, ag, "error_unavailable", (CharSequence)(hd_0.c + "GeoIP support is currently unavailable, has it been downloaded yet?"));
    public static final am da = new am("GEOIP_NONE_FOUND", 173, ag, "error_not_found", (CharSequence)(hd_0.c + "GeoIP information for $target not found."));
    public static final am cG = new am("LOCKDOWN_USAGE", 174, I, "usage", (CharSequence)(hd_0.c + "$command <reason> | $command end"));
    public static final am bV = new am("LOCKDOWN_MESSAGE", 175, I, "message", (CharSequence)(hd_0.c + "Server lockdown activated (reason: \"$reason" + hd_0.c + "\")"));
    public static final am X = new am("LOCKDOWN_END", 176, I, "stopped", (CharSequence)(hd_0.i + "Lockdown has been deactivated."));
    public static final am av = new am("LOCKDOWN_KICK_MESSAGE", 177, I, "kick_message", (CharSequence)"Server lockdown active, try again later.\\nReason: $reason");
    public static final am dw = new am("LOCKDOWN_KICK_MESSAGE_GLOBAL", 178, I, "kick_message_global", (CharSequence)"Network lockdown active, try again later.\\nReason: $reason");
    public static final am c = new am("LOCKDOWN_ERROR_NOT_ACTIVE", 179, I, "error_not_active", (CharSequence)(hd_0.c + "Lockdown is not active!"));
    public static final am aW = new am("RELOAD_SUCCESS", 180, i, "reload_success", (CharSequence)(hd_0.i + "LiteBans reloaded successfully."));
    public static final am ar = new am("RELOAD_FAIL", 181, i, "reload_fail", (CharSequence)(hd_0.c + "Reload failed."));
    public static final am bM = new am("RELOAD_FAIL_CONNECT", 182, i, "reload_fail_connect", (CharSequence)(hd_0.i + "Litebans reloaded. " + hd_0.c + "Failed to connect to database."));
    public static final am bU = new am("RELOAD_FAIL_CONFIG", 183, i, "reload_fail_config", (CharSequence)(hd_0.c + "[LiteBans] " + hd_0.F + "config.yml is not valid and could not be loaded, the default configuration will be used.\\n" + hd_0.c + "Please check the server console for more information."));
    public static final am bs = new am("RELOAD_FAIL_CONFIG_MESSAGES", 184, i, "reload_fail_messages", (CharSequence)(hd_0.c + "[LiteBans] " + hd_0.F + "messages.yml is not valid and could not be loaded, default messages will be used.\\n" + hd_0.c + "Please check the server console for more information."));
    public static final am aV = new am("RELOAD_FAIL_CONFIG_TEMPLATES", 185, i, "reload_fail_templates", (CharSequence)(hd_0.c + "[LiteBans] " + hd_0.F + "templates.yml is not valid and could not be loaded. Configured templates will be unavailable until this has been fixed.\\n" + hd_0.c + "Please check the server console for more information."));
    public static final am a3 = new am("FIXHISTORY_START", 186, i, "fix_history", (CharSequence)(hd_0.i + "Fixing history for table $table..."));
    public static final am c1 = new am("FIXHISTORY_END", 187, i, "fix_history_result", (CharSequence)(hd_0.i + "Added $amount entries."));
    public static final am aw = new am("FIXHISTORY_OFFLINE_UUIDS", 188, i, "fix_history_offline_uuids", (CharSequence)(hd_0.c + "$amount UUIDs were not fetched from Mojang since they are offline-mode UUIDs."));
    public static final am cP = new am("IMPORT_USAGE", 189, i, "import_usage", (CharSequence)(hd_0.c + "$command import start"));
    public static final am aO = new am("IMPORT_START", 190, i, "import_start", (CharSequence)(hd_0.i + "Importing from $db, this might take a while..."));
    public static final am bo = new am("IMPORT_FINISH", 191, i, "import_finish", (CharSequence)(hd_0.i + "Import finished successfully. $bans bans imported, $ipbans IP-bans."));
    public static final am cL = new am("IMPORT_FINISH_LITEBANS", 192, i, "import_finish_litebans", (CharSequence)(hd_0.i + "Import finished successfully. Added $amount entries to the database."));
    public static final am b9 = new am("IMPORT_FAIL", 193, i, "import_fail", (CharSequence)(hd_0.c + "Import failed. Check console."));
    public static final am bF = new am("IMPORT_UNSUPPORTED", 194, i, "import_unsupported", (CharSequence)(hd_0.c + "Importing from '$name' is not supported yet!"));
    public static final am bl = new am("ALLOW_USAGE", 195, i, "allow_usage", (CharSequence)(hd_0.c + "Usage: /litebans allow <add/remove/check> <user>"));
    public static final am cK = new am("ALLOW_ADDED", 196, i, "allow_added", (CharSequence)(hd_0.u + "Player " + hd_0.m + "$playerName" + hd_0.u + " has been " + hd_0.i + "allowed to join the server" + hd_0.u + "."));
    public static final am cA = new am("ALLOW_REMOVED", 197, i, "allow_removed", (CharSequence)(hd_0.u + "Player " + hd_0.m + "$playerName" + hd_0.u + " has been " + hd_0.c + "removed from the allow list" + hd_0.u + "."));
    public static final am bq = new am("ALLOW_CHECK_TRUE", 198, i, "allow_check_true", (CharSequence)(hd_0.i + "Player " + hd_0.m + "$playerName" + hd_0.i + " is allowed to join the server."));
    public static final am bO = new am("ALLOW_CHECK_FALSE", 199, i, "allow_check_false", (CharSequence)(hd_0.c + "Player " + hd_0.m + "$playerName" + hd_0.c + " is not allowed to join the server."));
    public static final am cD = new am("ALLOW_ERROR_ADD", 200, i, "allow_error_add", (CharSequence)(hd_0.c + "Error: $playerName is already allowed to join the server."));
    public static final am bg = new am("ALLOW_ERROR_REMOVE", 201, i, "allow_error_remove", (CharSequence)(hd_0.c + "Error: $playerName is not allowed to join the server."));
    public static final am dj = new am("RESET_DATABASE_CONFIRM", 202, i, "reset_database_confirm_quoted", (CharSequence)("\n" + hd_0.c + "WARNING: " + hd_0.u + "This command will reset your database, removing all active and inactive punishments permanently.\n" + hd_0.c + "WARNING: " + hd_0.r + "This operation is irreversible without restoring a database backup.\n" + hd_0.u + "Run '" + hd_0.c + "litebans $commandArgs confirm" + hd_0.u + "' to continue."));
    public static final am b8 = new am("RESET_DATABASE_RESULT", 203, i, "reset_database_result", (CharSequence)(hd_0.i + "Removed " + hd_0.u + "$amount " + hd_0.i + "$type from " + hd_0.u + "server:$serverScope" + hd_0.i + "."));
    public static final am dh = new am("DURATION", 204, "duration");
    public static final am aB = new am("EXPIRED", 205, dh, "expired", (CharSequence)"expired");
    public static final am bT = new am("FOREVER", 206, dh, "forever", (CharSequence)"forever");
    public static final am de = new am("YEAR", 207, dh, "year", (CharSequence)"year");
    public static final am q = new am("YEARS", 208, dh, "years", (CharSequence)"years");
    public static final am ae = new am("MONTH", 209, dh, "month", (CharSequence)"month");
    public static final am aT = new am("MONTHS", 210, dh, "months", (CharSequence)"months");
    public static final am cc = new am("WEEK", 211, dh, "week", (CharSequence)"week");
    public static final am aU = new am("WEEKS", 212, dh, "weeks", (CharSequence)"weeks");
    public static final am dJ = new am("DAY", 213, dh, "day", (CharSequence)"day");
    public static final am aq = new am("DAYS", 214, dh, "days", (CharSequence)"days");
    public static final am cH = new am("HOUR", 215, dh, "hour", (CharSequence)"hour");
    public static final am bh = new am("HOURS", 216, dh, "hours", (CharSequence)"hours");
    public static final am r = new am("MINUTE", 217, dh, "minute", (CharSequence)"minute");
    public static final am cB = new am("MINUTES", 218, dh, "minutes", (CharSequence)"minutes");
    public static final am dC = new am("SECOND", 219, dh, "second", (CharSequence)"second");
    public static final am bu = new am("SECONDS", 220, dh, "seconds", (CharSequence)"seconds");
    public static final am b_ = new am("DURATION_FORMAT", 221, dh, "format", (CharSequence)"%d %s");
    public static final am S = new am("DURATION_SEPARATOR", 222, dh, "separator", (CharSequence)", ");
    public static final am bG = new am("STRINGS", 223, "strings");
    public static final am aA = new am("STRINGS_GLOBAL", 224, bG, "global", (CharSequence)"global");
    public static final am ay = new am("STRINGS_NULL", 225, bG, "null", (CharSequence)"undefined");
    public static final am ap = new am("STRINGS_TRUE", 226, bG, "true", (CharSequence)"yes");
    public static final am bW = new am("STRINGS_FALSE", 227, bG, "false", (CharSequence)"no");
    public static final am O = new am("WEB", 228, "webhook");
    public static final am cw = new am("WEB_EVENT", 229, O, "events");
    public static final am bR = new am("WEB_BAN", 230, cw, "embed_ban");
    public static final am bp = new am("WEB_BAN_TITLE", 231, bR, "title", (CharSequence)"Banned");
    public static final am bE = new am("WEB_BAN_COLOR", 232, bR, "color", (CharSequence)"#CC2200");
    public static final am H = new am("WEB_BAN_CONTENT", 233, bR, "content", (CharSequence)"$playerName has been banned!\n\u2022 Banned by: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final am b2 = new am("WEB_BAN_FIELDS", 234, bR, "fields", (CharSequence)"");
    public static final am bB = new am("WEB_BAN_THUMB", 235, bR, "thumbnail", (CharSequence)"");
    public static final am cv = new am("WEB_UNBAN", 236, cw, "embed_unban");
    public static final am a_ = new am("WEB_UNBAN_TITLE", 237, cv, "title", (CharSequence)"Unbanned");
    public static final am bD = new am("WEB_UNBAN_COLOR", 238, cv, "color", (CharSequence)"#727374");
    public static final am aI = new am("WEB_UNBAN_CONTENT", 239, cv, "content", (CharSequence)"$playerName has been unbanned!\n\u2022 Unbanned by: $executor\n\u2022 Reason: $removalReason");
    public static final am bQ = new am("WEB_UNBAN_FIELDS", 240, cv, "fields", (CharSequence)"");
    public static final am A = new am("WEB_UNBAN_THUMB", 241, cv, "thumbnail", (CharSequence)"");
    public static final am aQ = new am("WEB_MUTE", 242, cw, "embed_mute");
    public static final am ab = new am("WEB_MUTE_TITLE", 243, aQ, "title", (CharSequence)"Muted");
    public static final am cy = new am("WEB_MUTE_COLOR", 244, aQ, "color", (CharSequence)"#BB9000");
    public static final am ba = new am("WEB_MUTE_CONTENT", 245, aQ, "content", (CharSequence)"$playerName has been muted!\n\u2022 Muted by: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final am f = new am("WEB_MUTE_FIELDS", 246, aQ, "fields", (CharSequence)"");
    public static final am dM = new am("WEB_MUTE_THUMB", 247, aQ, "thumbnail", (CharSequence)"");
    public static final am bw = new am("WEB_UNMUTE", 248, cw, "embed_unmute");
    public static final am aE = new am("WEB_UNMUTE_TITLE", 249, bw, "title", (CharSequence)"Unmuted");
    public static final am J = new am("WEB_UNMUTE_COLOR", 250, bw, "color", (CharSequence)"#727374");
    public static final am cT = new am("WEB_UNMUTE_CONTENT", 251, bw, "content", (CharSequence)"$playerName has been unmuted!\n\u2022 Unmuted by: $executor\n\u2022 Reason: $removalReason");
    public static final am cS = new am("WEB_UNMUTE_FIELDS", 252, bw, "fields", (CharSequence)"");
    public static final am bA = new am("WEB_UNMUTE_THUMB", 253, bw, "thumbnail", (CharSequence)"");
    public static final am aM = new am("WEB_WARN", 254, cw, "embed_warn");
    public static final am bb = new am("WEB_WARN_TITLE", 255, aM, "title", (CharSequence)"Warned");
    public static final am dD = new am("WEB_WARN_COLOR", 256, aM, "color", (CharSequence)"#FFAA11");
    public static final am bY = new am("WEB_WARN_CONTENT", 257, aM, "content", (CharSequence)"$playerName has been warned!\n\u2022 Warned by: $executor\n\u2022 Duration: $duration\n\u2022 Reason: $reason");
    public static final am cg = new am("WEB_WARN_FIELDS", 258, aM, "fields", (CharSequence)"");
    public static final am N = new am("WEB_WARN_THUMB", 259, aM, "thumbnail", (CharSequence)"");
    public static final am dn = new am("WEB_UNWARN", 260, cw, "embed_unwarn");
    public static final am cz = new am("WEB_UNWARN_TITLE", 261, dn, "title", (CharSequence)"Unwarned");
    public static final am ci = new am("WEB_UNWARN_COLOR", 262, dn, "color", (CharSequence)"#727374");
    public static final am aF = new am("WEB_UNWARN_CONTENT", 263, dn, "content", (CharSequence)"$playerName has been unwarned!\n\u2022 Unwarned by: $executor\n\u2022 Reason: $removalReason");
    public static final am E = new am("WEB_UNWARN_FIELDS", 264, dn, "fields", (CharSequence)"");
    public static final am dF = new am("WEB_UNWARN_THUMB", 265, dn, "thumbnail", (CharSequence)"");
    public static final am z = new am("WEB_KICK", 266, cw, "embed_kick");
    public static final am bx = new am("WEB_KICK_TITLE", 267, z, "title", (CharSequence)"Kicked");
    public static final am cn = new am("WEB_KICK_COLOR", 268, z, "color", (CharSequence)"#999900");
    public static final am dt = new am("WEB_KICK_CONTENT", 269, z, "content", (CharSequence)"$playerName has been kicked!\n\u2022 Kicked by: $executor\n\u2022 Reason: $reason");
    public static final am ct = new am("WEB_KICK_FIELDS", 270, z, "fields", (CharSequence)"");
    public static final am bn = new am("WEB_KICK_THUMB", 271, z, "thumbnail", (CharSequence)"");
    public static final am bL = new am("WEB_ALTS", 272, cw, "embed_alts");
    public static final am bt = new am("WEB_ALTS_TITLE", 273, bL, "title", (CharSequence)"Scanned $playerName");
    public static final am ca = new am("WEB_ALTS_COLOR", 274, bL, "color", (CharSequence)"#999999");
    public static final am cr = new am("WEB_ALTS_THUMB", 275, bL, "thumbnail", (CharSequence)"");
    public final String Q;
    public @Nullable CharSequence c3;
    private static final /* synthetic */ am[] t;

    public static am[] values() {
        return (am[])t.clone();
    }

    public static am a(String string) {
        return Enum.valueOf(am.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private am() {
        this((String)var1_-1, (int)var2_-1, (am)var3_1, (String)var4_2, null);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private am(@Nullable CharSequence charSequence) {
        this((String)var1_-1, (int)var2_-1, ((am)charSequence).a() + '.' + (String)var4_2, (CharSequence)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private am() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Q = var3_1;
    }

    /*
     * WARNING - void declaration
     */
    private am() {
        this((String)var1_-1, (int)var2_-1, (String)var3_1);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.a((CharSequence)var4_2);
    }

    public static String a(Object object, boolean bl, boolean bl2) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof CharSequence) {
            return object.toString();
        }
        if (object instanceof Character) {
            return new String(new char[]{((Character)object).charValue()});
        }
        if (bl) {
            if (bl2) {
                return object.toString().trim();
            }
            return object.toString();
        }
        return null;
    }

    public static am c(String string) {
        string = string.toUpperCase(Locale.ROOT);
        for (am am2 : litebans.am.values()) {
            if (!am2.name().equals(string)) continue;
            return am2;
        }
        throw new AssertionError((Object)string);
    }

    public static String b(String string) {
        return litebans.am.c(string).toString();
    }

    public static @NotNull CharSequence a(@NotNull a_ a_2) {
        switch (a_2.c()) {
            case h: {
                return B;
            }
            case j: {
                return aD;
            }
            case c: {
                return bz;
            }
            case g: {
                return cx;
            }
        }
        throw new AssertionError();
    }

    public static @NotNull String a(CharSequence charSequence, boolean bl) {
        String string = hd_0.a('&', charSequence.toString().replace("\\n", "\n"));
        if (bl) {
            string = litebans.y.b.a(string);
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

    public static @Nullable String a(am am2, @Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!am2.Q.startsWith("webhook") && charSequence.toString().contains("#$id")) {
            charSequence = charSequence.toString().replace("#$id", "#&b$id");
        }
        return litebans.bF.a(charSequence);
    }

    public String a(String string, @Nullable Object object) {
        return this.a(litebans.bF.c(string), object);
    }

    public String b(CharSequence charSequence) {
        return this + "\n" + charSequence;
    }

    @Override
    public char charAt(int n) {
        if (this.c3 == null) {
            return '?';
        }
        return this.c3.charAt(n);
    }

    public boolean isEmpty() {
        return this.length() == 0;
    }

    @Override
    public int length() {
        if (this.c3 == null) {
            return 0;
        }
        return this.c3.length();
    }

    public @NotNull String a(CharSequence charSequence, @Nullable Object object) {
        Object object2 = object;
        if (object2 == null) {
            object2 = "";
        }
        return this.c3.toString().replace(charSequence.toString(), object2.toString());
    }

    public void a(@Nullable CharSequence charSequence) {
        String string = charSequence == null ? null : litebans.am.a(charSequence.toString(), false);
        string = litebans.am.a(this, string);
        this.c3 = string;
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.c3.subSequence(n, n2);
    }

    @Override
    public String toString() {
        return String.valueOf(this.c3);
    }

    public String a() {
        return this.Q;
    }

    private static final /* synthetic */ am[] b() {
        return new am[]{at, a, cQ, aC, bk, ch, dp, cX, c_, bH, W, bZ, bJ, cN, dv, dG, by, cb, dg, I, ag, i, bK, a0, k, dd, df, R, cu, c5, bS, F, v, db, d, aj, ak, bj, du, az, bd, h, dy, cZ, cm, cl, be, aX, aN, aL, x, b, g, c6, cC, aP, cI, cE, cp, a9, a1, dB, b3, cJ, ai, dc, aa, U, cW, b5, D, cj, af, dk, L, cO, aJ, c2, ah, ce, dx, m, dq, e, dK, di, a8, u, aR, cY, bP, ds, dA, c9, a2, cU, a6, cV, Y, bC, c8, a5, aS, as, K, ad, b6, dL, dz, bf, bm, cs, cf, a7, T, l, j, B, aD, bz, cx, co, V, aG, cM, am, dm, bi, al, b7, bc, Z, aK, dI, ax, dE, c0, b4, c7, bX, ac, M, dH, b1, br, aZ, G, P, dr, cR, bN, o, n, w, cd, p, b0, a4, ao, aH, y, aY, au, c4, C, dl, bv, an, bI, cq, s, cF, ck, da, cG, bV, X, av, dw, c, aW, ar, bM, bU, bs, aV, a3, c1, aw, cP, aO, bo, cL, b9, bF, bl, cK, cA, bq, bO, cD, bg, dj, b8, dh, aB, bT, de, q, ae, aT, cc, aU, dJ, aq, cH, bh, r, cB, dC, bu, b_, S, bG, aA, ay, ap, bW, O, cw, bR, bp, bE, H, b2, bB, cv, a_, bD, aI, bQ, A, aQ, ab, cy, ba, f, dM, bw, aE, J, cT, cS, bA, aM, bb, dD, bY, cg, N, dn, cz, ci, aF, E, dF, z, bx, cn, dt, ct, bn, bL, bt, ca, cr};
    }

    static {
        t = litebans.am.b();
    }
}

