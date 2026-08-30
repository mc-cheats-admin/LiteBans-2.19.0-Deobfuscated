# 🛡️ LiteBans 2.19.0 — Полная деобфускация и чистый исходный код

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.8--1.21.x-blue.svg)](https://spigotmc.org/)
[![Деобфускация](https://img.shields.io/badge/Деобфускация-11%2C554%20Строк%20Расшифровано-brightgreen.svg)]()
[![Сборка](https://img.shields.io/badge/Сборка-Успешно-brightgreen.svg)]()
[![Платформы](https://img.shields.io/badge/Платформы-Bukkit%20%7C%20Bungee%20%7C%20Velocity%20%7C%20Fabric-blue.svg)]()

Полностью извлечённый, расшифрованный и деобфусцированный исходный код плагина **LiteBans** версии **2.19.0** (автор Ruan).
Кодовая база приведена к стандартной структуре Maven (src/main/java), очищена от строкового шифрования и артефактов декомпилятора — 100% человекочитаемый Java-код.

---

## ⚡ Результаты деобфускации

* 🔓 **Расшифровано 11,554 строк:** Вскрыт встроенный алгоритм шифрования hl.a(). Все строки (SQL-запросы, команды, права доступа, сообщения и служебные ключи) переведены в открытый текст.
* 🧩 **Инлайнинг 3,190 массивов:** Табличные обращения к строкам (g[0], c[1]) заменены на прямые строковые константы.
* 🧹 **Коррекция структуры классов:** Исправлены некорректные модификаторы public static class на верхнем уровне в 670 файлах, удалены синтетические предупреждения CFR.
* 🗂️ **Maven-структура и мультиплатформенность:** Поддержка всех 4 целевых платформ (Spigot/Paper/Folia, BungeeCord, Velocity, Fabric).

---

## 🔍 Архитектура и основные компоненты

LiteBans — флагманская система управления наказаниями игроков и синхронизации серверов:

### 1. Поддержка платформ
* **Bukkit / Spigot / Paper / Folia:** Нативные обработчики команд, события чата и входа (litebans.BukkitPlugin).
* **BungeeCord / Waterfall:** Сетевая синхронизация через каналы плагинов (litebans.BungeePlugin).
* **Velocity:** Высокопроизводительный перехват игроков на уровне прокси (litebans.VelocityPlugin).
* **Fabric:** Серверный мод для Fabric (litebans.FabricMod).

### 2. Движок баз данных и синхронизации
* **Поддерживаемые СУБД:** MySQL, MariaDB, PostgreSQL, SQLite, H2.
* **Каналы синхронизации:** Мгновенный обмен данными между серверами сети через Plugin Messaging и прямой SQL-опрос.
* **История UUID и IP:** Полное отслеживание смены ников, альтов, дубликатов IP и интеграция с GeoIP2/MaxMind.

### 3. Команды модерации
* /ban, /tempban, /ipban, /tempipban
* /mute, /tempmute, /ipmute, /tempipmute
* /warn, /unwarn, /kick, /history, /checkban, /checkmute, /dupeip
* /litebans (reload, import, fixhistory, sqlexec, clearhistory)

---

## 📦 Структура репозитория

`
LiteBans/
├── src/
│   ├── main/
│   │   ├── java/                # 799 деобфусцированных исходников .java
│   │   │   └── litebans/
│   │   │       ├── api/         # Публичный LiteBans API и события
│   │   │       ├── mixin/       # Fabric Mixin хуки
│   │   │       └── [core]/      # Модули БД, команды, вебхуки, кэши
│   │   └── resources/           # plugin.yml, bungee.yml, velocity-plugin.json, config.yml, messages.yml
├── tools/                       # Скрипты сборки
├── pom.xml                      # Стандартный файл сборки Maven
└── README.md                    # Документация проекта
`

---

## ⚡ Инструкция по сборке

### Быстрая упаковка (Python)
`ash
python tools/build.py
`

### Сборка через Maven
`ash
mvn clean package
`

---

## 📋 Системные требования

| Компонент | Требование |
|---|---|
| **Java** | Java 8, 11, 17, 21+ |
| **Платформы** | Spigot/Paper (1.8–1.21.x), BungeeCord, Velocity, Fabric |
| **Базы данных** | MySQL / MariaDB / PostgreSQL / SQLite / H2 |

---

## ⚖️ Дисклеймер
Данный репозиторий опубликован исключительно в исследовательских и образовательных целях для изучения архитектуры мультиплатформенных плагинов и протоколов синхронизации баз данных.
