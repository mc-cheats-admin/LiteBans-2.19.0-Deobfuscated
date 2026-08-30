package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_198
extends MessageHandler {
    public LiteBansModule_198(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        boolean flag;
        Collection collection;
        String string;
        String string2;
        int n;
        Object targetObj = LiteBansModule_336.BaseCoreGenericHandler();
        int n3 = 4;
        String string3 = targetObj.substring(n2, n3);
        CommandArgumentUtils.BaseCoreGenericHandler(this, (CharSequence)("LiteBans - Copyright \u00a9 2016-" + string3 + " Ruan Wessels. All rights reserved.\n\n"));
        CommandArgumentUtils.BaseCoreGenericHandler(this, (CharSequence)"LiteBans includes the following third-party software:\n");
        CommandArgumentUtils.BaseCoreGenericHandler(this, (CharSequence)"Software Licensed Under Apache License Version 2.0 (https://www.apache.org/licenses/LICENSE-2.0):");
        targetObj = this;
        MessageHandler messageHandler = this;
        n2 = 0;
        String[] args = new String[]{"Kotlin - Copyright (BanHandler_2) 2010-2020 JetBrains AsyncBackgroundTask_21.r.BroadcastService and respective authors and developers", "HikariCP - Copyright (BanHandler_2) 2013 Brett Wooldridge", "json-simple - Copyright (BanHandler_2) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation"};
        String[] filteredArgs = args;
        Collection collection2 = new ArrayList(args.length);
        int n4 = filteredArgs.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = filteredArgs[n];
            collection = collection2;
            flag = false;
            collection.add("  " + string);
        }
        CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, CollectionUtilities.BaseCoreGenericHandler((List)collection2, "\n", null, null, 0, null, null, 62, null));
        CommandArgumentUtils.BaseCoreGenericHandler(this, (CharSequence)"=====\nOther Software Licenses:");
        targetObj = this;
        messageHandler = this;
        n2 = 0;
        args = new String[]{"bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use InitializerHandler_3 source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions InitializerHandler_3 binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer InitializerHandler_3 the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH "};
        flag2 = false;
        filteredArgs = args;
        collection2 = new ArrayList(args.length);
        flag3 = false;
        n4 = filteredArgs.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = filteredArgs[n];
            collection = collection2;
            flag = false;
            collection.add("  " + string);
        }
        CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, CollectionUtilities.BaseCoreGenericHandler((List)collection2, "\n", null, null, 0, null, null, 62, null));
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"LiteBans - Copyright \u00a9 2016-", " Ruan Wessels. All rights reserved.\n\n", "LiteBans includes the following third-party software:\n", "Software Licensed Under Apache License Version 2.0 (https://www.apache.org/licenses/LICENSE-2.0):", "Kotlin - Copyright (BanHandler_2) 2010-2020 JetBrains AsyncBackgroundTask_21.r.BroadcastService and respective authors and developers", "HikariCP - Copyright (BanHandler_2) 2013 Brett Wooldridge", "json-simple - Copyright (BanHandler_2) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation", "  ", "\n", "=====\nOther Software Licenses:", "bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use InitializerHandler_3 source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions InitializerHandler_3 binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer InitializerHandler_3 the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH ", "  ", "\n", "Kotlin - Copyright (BanHandler_2) 2010-2020 JetBrains AsyncBackgroundTask_21.r.BroadcastService and respective authors and developers", "HikariCP - Copyright (BanHandler_2) 2013 Brett Wooldridge", "json-simple - Copyright (BanHandler_2) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation", "  ", "\n", "bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use InitializerHandler_3 source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions InitializerHandler_3 binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer InitializerHandler_3 the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH ", "  ", "\n"};
}

