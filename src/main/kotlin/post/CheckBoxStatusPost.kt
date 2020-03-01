package post

class CheckBoxStatusPost {



    private companion object private fun setChecked(isCheckId: String): Long{

        return when(isCheckId){
            "Не интересно" -> 1
            "Сохранить в закладках" -> 2
            "Пожаловаться" -> 3
            "Уведомлять о записях" -> 4
            else -> 0
        }
    }
    //TODO
    private var value: Long = setChecked("Не интересно")
}