import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.InlineKeyboardMarkup
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.InlineKeyboardButton
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton


fun main() {

    val bot = bot {

        token = ""

        dispatch {
            command("start") {
                val keyboardMarkup = KeyboardReplyMarkup(keyboard = generateUsersButton(), resizeKeyboard = true)
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Choose to see information",
                    replyMarkup = keyboardMarkup
                )
            }
            text("Kotlin") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(InlineKeyboardButton.Url(text = "Get Started", url = "https://kotlinlang.org/docs/getting-started.html")),
                    listOf(InlineKeyboardButton.Url(text = "Why Kotlin", url = "https://kotlinlang.org/#why-kotlin"))
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Kotlin is a modern multiplatform programming language developed y JetBrains & Open-source Contributors",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
            text("Developer Tools") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(
                        InlineKeyboardButton.Url(text = "IntelliJ IDEA", url = "https://www.jetbrains.com/idea/features/"),
                        InlineKeyboardButton.Url(text = "PyCharm", url = "https://www.jetbrains.com/pycharm/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "WebStorm", url = "https://www.jetbrains.com/webstorm/"),
                        InlineKeyboardButton.Url(text = "PhpStorm", url = "https://www.jetbrains.com/phpstorm/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "Rider", url = "https://www.jetbrains.com/rider/"),
                        InlineKeyboardButton.Url(text = "CLion", url = "https://www.jetbrains.com/clion/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "Datalore", url = "https://datalore.jetbrains.com"),
                        InlineKeyboardButton.Url(text = "DataGrip", url = "https://www.jetbrains.com/datagrip/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "RubyMine", url = "https://www.jetbrains.com/ruby/"),
                        InlineKeyboardButton.Url(text = "AppCode", url = "https://www.jetbrains.com/objc/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "GoLand", url = "https://www.jetbrains.com/go/"),
                        InlineKeyboardButton.Url(text = "PyCharm Edu", url = "https://www.jetbrains.com/pycharm-edu/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "IntelliJ IDEA Edu", url = "https://www.jetbrains.com/idea-edu/"),
                        InlineKeyboardButton.Url(text = "Code With Me", url = "https://www.jetbrains.com/code-with-me/")
                    ),
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Whichever technologies you use, there's a JetBrains tool to match\n\n" +
                            "IntelliJ IDEA - The most intelligent JVM IDE\n\n" +
                            "PyCharm - Python IDE for professional developers\nn" +
                            "WebStorm - The smartest JavaScript IDE\n\n" +
                            "PhpStorm - Lightning-smart PHP IDE\n\n" +
                            "Rider - Cross-platform .NET IDE\n\n" +
                            "CLion - A smart cross-platform IDE for C and C++\n\n" +
                            "Datalore - A powerful and secure environment for Jupyter notebooks\n\n" +
                            "DataGrip - Many databases, one tool\n\n" +
                            "RubyMine - The most intelligent Ruby IDE\n\n" +
                            "AppCode - Smart IDE for iOS/macOS development\n\n" +
                            "GoLand - Capable and Ergonomic GO IDE\n\n" +
                            "PyCharm - Professional tool to learn and teach programming with Python\n\n" +
                            "IntelliJ IDEA Edu - The professional tool learn and teach programming with Java\n\n" +
                            "Code With Me - The collaborative development and pair programming service",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
            text("Team Tools") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
                    listOf(
                        InlineKeyboardButton.Url(text = "Space", url = "https://www.jetbrains.com/space/"),
                        InlineKeyboardButton.Url(text = "Datalore", url = "https://datalore.jetbrains.com/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "YouTrack", url = "https://www.jetbrains.com/youtrack/"),
                        InlineKeyboardButton.Url(text = "TeamCity", url = "https://www.jetbrains.com/teamcity/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "Upsource", url = "https://www.jetbrains.com/upsource/"),
                        InlineKeyboardButton.Url(text = "Hub", url = "https://www.jetbrains.com/hub/")
                    ),
                    listOf(
                        InlineKeyboardButton.Url(text = "Code With Me", url = "https://www.jetbrains.com/hub/"),
                        InlineKeyboardButton.Url(text = "Projector", url = "https://www.jetbrains.com/projector/")
                    ),
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Whichever technologies you use, there's a JetBrains tool to match\n\n" +
                            "Space - An all-in-one solution for software projects and teams\n\n" +
                            "Datalore - A powerful and secure environment for Jupyter notebooks\n\n" +
                            "YouTrack - The project management tool designed for agile teams\n\n" +
                            "TeamCity - Powerful Continuous Integration out of the box\n\n" +
                            "Upsource - Code review and project analytics\n\n" +
                            "Hub - The YouTrack, TeamCity, and Upsource Connector\n\n" +
                            "Code With Me - The collaborative development and pair programming service\n\n" +
                            "Projector - Run JetBrains IDEs and Swing apps remotely over the network\n",
                    replyMarkup = inlineKeyboardMarkup
                )
            }
            text("Learning Tools") {
                val inlineKeyboardMarkup = InlineKeyboardMarkup.createSingleButton(
                    InlineKeyboardButton.Url(text = "Find Your Solution", url = "https://www.jetbrains.com/education/")
                )
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Solutions and opportunities for teachers and students",
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
        listOf(KeyboardButton("Learning Tools").also {
            InlineKeyboardButton.Url(
                url = "https://www.jetbrains.com/education/",
                text = "Something"
            )
        }),
        listOf(KeyboardButton("Kotlin"))
    )
}