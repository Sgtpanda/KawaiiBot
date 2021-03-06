package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import me.aurieh.ichigo.utils.StringUtil

@Command(description = "Press F to pay respects")
class F : ICommand {
    private val hearts = arrayOf("❤", "💛", "💚", "💙", "💜")

    override fun run(ctx: CommandContext) {
        val heart = Helpers.chooseRandom(hearts)
        val reason = ctx.args.collect()
        if (!reason.isEmpty()) {
            ctx.send("**${ctx.author.name}** has paid their respects for **${StringUtil.cleanerContent(reason)}** $heart")
        } else {
            ctx.send("**${ctx.author.name}** has paid their respects $heart")
        }

    }
}
