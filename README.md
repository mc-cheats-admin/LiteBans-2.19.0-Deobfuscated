# 🛡️ LiteBans 2.19.0 — Clean Deobfuscated & Structured Source Code

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.8--1.21.x-blue.svg)](https://spigotmc.org/)
[![Deobfuscation](https://img.shields.io/badge/Deobf-11%2C554%20Strings%20Decrypted-brightgreen.svg)]()
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen.svg)]()
[![Platforms](https://img.shields.io/badge/Platforms-Bukkit%20%7C%20Bungee%20%7C%20Velocity%20%7C%20Fabric-blue.svg)]()

Fully extracted, decrypted, and deobfuscated source code of **LiteBans** version **2.19.0** (by Ruan).
Structured into a standard Maven layout (src/main/java), free of obfuscation strings and decompilation artifacts, 100% human-readable.

---

## ⚡ Deobfuscation Achievements

* 🔓 **11,554 Encrypted Strings Decrypted:** All XOR key-based encrypted strings in hl.a() decrypted into direct Unicode/ASCII text literals.
* 🧩 **3,190 String Array References Inlined:** Static table lookups (g[0], c[1]) replaced with direct string constants.
* 🧹 **Clean Class Declarations:** Fixed 670 top-level static modifier issues and cleaned CFR synthetic comments across 799 Java files.
* 🗂️ **Maven Layout & Multi-Platform Descriptors:** Full support for Bukkit/Spigot, BungeeCord, Velocity, and Fabric.

---

## 🔍 Core Architecture & Features

LiteBans is an industry-leading multi-platform punishment management system for Minecraft servers:

### 1. Multi-Platform Support
* **Bukkit / Spigot / Paper / Folia:** Native command hooks, event listeners, and chat formatters (litebans.BukkitPlugin).
* **BungeeCord / Waterfall:** Proxy-wide network synchronization and channel messaging (litebans.BungeePlugin).
* **Velocity:** High-performance proxy player interceptor (litebans.VelocityPlugin).
* **Fabric:** Dedicated server Fabric mod loader (litebans.FabricMod).

### 2. Database & Sync Engine
* **Supported Drivers:** MySQL, MariaDB, PostgreSQL, SQLite, H2.
* **Sync Channels:** Instant cross-server broadcast via Plugin Messaging Channels and direct SQL polling.
* **UUID & IP History:** Historical tracking of player aliases, GeoIP data, and duplicate accounts.

### 3. Moderation Commands
* /ban, /tempban, /ipban, /tempipban
* /mute, /tempmute, /ipmute, /tempipmute
* /warn, /unwarn, /kick, /history, /checkban, /checkmute, /dupeip
* /litebans (reload, import, fixhistory, sqlexec, clearhistory)

---

## 📦 Project Structure

`
LiteBans/
├── src/
│   ├── main/
│   │   ├── java/                # 799 clean .java source files
│   │   │   └── litebans/
│   │   │       ├── api/         # Public LiteBans API & Events
│   │   │       ├── mixin/       # Fabric Mixin hooks
│   │   │       └── [core]/      # Database pool, commands, webhooks, sync engine
│   │   └── resources/           # plugin.yml, bungee.yml, velocity-plugin.json, config.yml, messages.yml
├── tools/                       # Build tools and CFR decompiler
├── pom.xml                      # Standard Maven POM
└── README.md                    # Project documentation
`

---

## ⚡ Build Instructions

### Standalone Package Script
`ash
python tools/build.py
`

### Maven Build
`ash
mvn clean package
`

---

## 📋 Requirements & Dependencies

| Component | Requirement |
|---|---|
| **Java** | Java 8, 11, 17, 21+ |
| **Server Platforms** | Spigot/Paper (1.8–1.21.x), BungeeCord, Velocity, Fabric |
| **Database** | MySQL / MariaDB / PostgreSQL / SQLite / H2 |

---

## ⚖️ Disclaimer
This repository is published for research and educational purposes to study multi-platform plugin architecture, database synchronization protocols, and server administration tools.
