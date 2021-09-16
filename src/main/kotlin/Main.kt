import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.InlineKeyboardMarkup
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.ParseMode.MARKDOWN
import com.github.kotlintelegrambot.entities.ParseMode.MARKDOWN_V2
import com.github.kotlintelegrambot.entities.ReplyKeyboardRemove
import com.github.kotlintelegrambot.entities.TelegramFile.ByUrl
import com.github.kotlintelegrambot.entities.dice.DiceEmoji
import com.github.kotlintelegrambot.entities.files.PhotoSize
import com.github.kotlintelegrambot.entities.inlinequeryresults.InlineQueryResult
import com.github.kotlintelegrambot.entities.inlinequeryresults.InputMessageContent
import com.github.kotlintelegrambot.entities.inputmedia.InputMediaPhoto
import com.github.kotlintelegrambot.entities.inputmedia.MediaGroup
import com.github.kotlintelegrambot.entities.keyboard.InlineKeyboardButton
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.extensions.filters.Filter
import com.github.kotlintelegrambot.logging.LogLevel
import com.github.kotlintelegrambot.network.fold

fun main() {

    val bot = bot {

        token = ""

        dispatch {
            command("inlineButtons") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(InlineKeyboardButton.CallbackData(text = "Test Inline Button", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "Show alert", callbackData = "showAlert"))
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
            command("userButtons") {
                val keyboardMarkup = KeyboardReplyMarkup(keyboard = generateUsersButton(), resizeKeyboard = true)
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Choose to see information",
                    replyMarkup = keyboardMarkup
                )
            }
            text("Kotlin") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(InlineKeyboardButton.CallbackData(text = "Get Started", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "Why Kotlin", callbackData = "testButton"))
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Kotlin is a modern multiplatform programming language developed y JetBrains & Open-source Contributors",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
            text ("Developer Tools") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(InlineKeyboardButton.CallbackData(text = "IntelliJ IDEA", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "PyCharm", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "WebStorm", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "PhpStorm", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "Rider", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "CLion", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "Datalore", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "DataGrip", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "RubyMine", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "AppCode", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "GoLand", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "PyCharm Edu", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "IntelliJ IDEA Edu", callbackData = "testButton")),
                    listOf(InlineKeyboardButton.CallbackData(text = "Code With Me", callbackData = "testButton")),
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Whichever technologies you use, there's a JetBrains tool to match",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
        }
    }
    bot.startPolling()
}

fun generateUsersButton(): List<List<KeyboardButton>> {
    return listOf(
        listOf(KeyboardButton("Developer Tools")),
        listOf(KeyboardButton("Team Tools")),
        listOf(KeyboardButton("Learning Tools")),
        listOf(KeyboardButton("Kotlin"))
    )
}