package net.yukkuritaku.discordbot.commands.stamp.impl.virtualsinger;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.discordbot.utils.ColorUtils;
import net.yukkuritaku.discordbot.utils.ReplyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class MikuStampCommand extends Command {

    public MikuStampCommand(){
        this.name = "stampmiku";
        this.help = "ミクちゃんのスタンプからどれかが選ばれるよ";
        this.aliases = new String[] {"miku", "39", "みく", "みくちゃん", "ミク", "ミクちゃん", "初音ミク", "初音ミクちゃん"};
    }

    @Override
    protected void execute(final CommandEvent event) {
        try{
            final List<RandomMikuStamps> values = Arrays.asList(RandomMikuStamps.values());
            final int size = values.size();
            final Random rng = new Random();
            final RandomMikuStamps mikuStamps = values.get(rng.nextInt(size));
            EmbedBuilder embedBuilder = new EmbedBuilder();
            final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mikuStamps + "_rip/" + mikuStamps + "/" + mikuStamps + ".png";
            //final String url = "https://sekai-res.dnaroma.eu/file/sekai-assets/stamp/" + mikuStamps + "_rip/" + mikuStamps + "/" + mikuStamps + ".webp";
            embedBuilder.setImage(url);
            embedBuilder.setColor(ColorUtils.MIKU.getColor());
            event.reply(embedBuilder.build());
        }
        catch (Exception e){
            ReplyUtils.logError(event, "Send Failed!");
            ReplyUtils.logError(event, "Please Contact to ゆっくりたく(Yukkuritaku)#8298");
            ReplyUtils.logException(event, e.toString());
            e.printStackTrace();
        }
    }

    public enum RandomMikuStamps{
        //はやく来て...(にーごみく)
        stamp0489,

        //セカイにようこそ～(わんだしょみく)
        stamp0488,

        //ここで止まっていいの？(びびばすみく)
        stamp0487,

        //かわいくいくよっ(ももじゃんみく)
        stamp0486,

        //その想い大事にしてね(れおにみく)
        stamp0485,

        //みんなと歌えてうれしい♪
        stamp0521,

        //よろしく
        stamp0001,

        //いいステージだったね！
        stamp0242,

        //39♪
        stamp0241,

        //いっしょに歌おう！
        stamp0240,

        //またね～
        stamp0239,

        //ごめんなさい...
        stamp0238,

        //ありがとう！
        stamp0237,

        //楽しいライブだったね！
        stamp0236,

        //うぅ...
        stamp0235,

        //えへへ
        stamp0234,

        //わっ！
        stamp0233,

        //がんばろう！
        stamp0232,

        //ミュージックスタート！
        stamp0032,
    }
}
