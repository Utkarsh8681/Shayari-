package com.example.shayaris.ui.theme.model

data class ShayariModule(
    val category : String,
    val shayaris : List<String>
)


fun getList():List<ShayariModule>{
    return listOf<ShayariModule>(
        ShayariModule("Love", listOf(
            "I love you is the worst line",
            "तेरी धड़कन में बसी हूँ मैं, तुझे खुद से जुदा कैसे कर दूं।",
            "दिल के हर कोने में बस तुम ही हो, तुम्हें भुला दूँ ऐसा कोई इरादा नहीं।",
            "तुम्हारे बिना ये दिल खाली सा लगता है, तुमसे मिलने की तमन्ना हर दिन रहती है।",
            "तुमसे मिलने की खुशी में एक नई सुबह होती है, तुम्हारी बाहों में ये दुनिया भुला दी जाती है।",
            "तेरे बिना ये जिंदगी अधूरी है, तेरा साथ ही तो मेरे जीने की वजह है।",
            "हर पल तुमसे मिलने की ख्वाहिश होती है, तुम्हारे बिना ये दिल उदास सा रहता है।",
            "तुमसे मोहब्बत करना मेरी जिंदगी का सबसे हसीन पल है।",
            "तेरे बिना ये दिल नहीं लगता, तू ही तो है इस दिल की धड़कन।",
            "तुम्हारे बिना ये जहाँ वीरान सा लगता है, तुम्हारे बिना ये दिल परेशान सा लगता है।",
            "तेरी आँखों में खो जाने का मन करता है, तुझसे प्यार निभाने का मन करता है।",
            "तेरे बिना ये दिल तन्हा सा लगता है, तेरे बिना ये जहाँ अधूरा सा लगता है।",
            "तुम्हारी यादों में हर रात गुजरती है, तुम्हारे ख्यालों में ये जिंदगी सवरती है।"
        )),

        ShayariModule("Friendship", listOf(
            "दोस्ती नाम है सुख-दुख की कहानी का, दोस्ती राज है सदा मुस्कुराने का।",
            "सच्ची दोस्ती वही होती है, जो हर मुश्किल में साथ देती है।",
            "दोस्ती के बिना ये दुनिया अधूरी है, सच्चे दोस्त ही जीवन की पूँजी हैं।",
            "दोस्ती वो नहीं जो जान देती है, दोस्ती वो है जो साथ देती है।",
            "दोस्त वह है जो आपकी आवाज में आवाज मिलाकर आपकी खुशी में खुश होता है।",
            "दोस्ती के बंधन को कोई तोड़ नहीं सकता, सच्चे दोस्त कभी जुदा नहीं होते।",
            "दोस्तों के बिना जिंदगी अधूरी है, सच्चे दोस्तों के बिना खुशी अधूरी है।",
            "सच्चे दोस्त वही हैं, जो मुश्किलों में साथ खड़े होते हैं।",
            "दोस्ती का मतलब समझना है, सच्चे दोस्त ही दिल से जुड़ते हैं।",
            "दोस्ती का नाम ही सच्चाई है, सच्चे दोस्तों से ही दुनिया रोशन है।",
            "दोस्ती वो है जो हर दुःख में साथ खड़ी होती है।",
            "दोस्ती की महक हर रिश्ते से अनोखी है, सच्ची दोस्ती ही सच्चा सुख देती है।",
            "सच्चे दोस्त वही हैं, जो हर पल साथ निभाते हैं।"
        )) ,
        ShayariModule("Life", listOf(
            "जिंदगी एक सफर है, सुहाना सा, यहाँ कल क्या हो किसने जाना।",
            "हर पल को जी भर के जी लो, जिंदगी हर किसी को दूसरा मौका नहीं देती।",
            "जिंदगी का असली मजा वही है, जो मुश्किलों में मुस्कुराना सिखा दे।",
            "जिंदगी का हर दिन एक नया मौका है, इसे खुशी और उत्साह से जियो।",
            "जिंदगी जीने के लिए है, इसे खुशियों से भर लो।",
            "जिंदगी का सफर आसान नहीं होता, पर इसे हंसकर जीना ही असली जीत है।",
            "जिंदगी एक पहेली है, इसे सुलझाना हमारा काम है।",
            "जिंदगी में जो भी होता है, अच्छे के लिए होता है।",
            "जिंदगी के हर पल को मुस्कुरा कर जियो, यही असली जिंदगी है।",
            "जिंदगी को आसान नहीं, खुद को मजबूत बनाओ।",
            "जिंदगी का हर लम्हा खास होता है, इसे खुशियों से भर लो।",
            "जिंदगी का मतलब सिर्फ जीना नहीं, बल्कि हर पल को खुशियों से सजाना है।",
            "जिंदगी के हर मोड़ पर खुश रहना ही असली जीत है।"
        )),

        ShayariModule("Motivational", listOf(
            "हौंसले बुलंद रखो, मंजिल दूर नहीं होती।",
            "सपनों की उड़ान भरनी है, तो हौंसलों को मजबूत बनाओ।",
            "हार मत मानो, जिंदगी एक नया मौका हमेशा देती है।",
            "सफलता का रास्ता मेहनत से ही होकर गुजरता है।",
            "जो सपने देखते हैं, वो ही उन्हें पूरा करने की हिम्मत रखते हैं।",
            "अपने सपनों को पंख दो, उन्हें पूरा करने की कोशिश करो।",
            "मुश्किलें आएंगी, पर हार मत मानो, सफलता तुम्हारे कदम चूमेगी।",
            "मेहनत ही सफलता की कुंजी है, इसे कभी मत छोड़ो।",
            "हर मुश्किल का सामना करो, क्योंकि जीत तुम्हारी ही होगी।",
            "सपनों को साकार करने के लिए मेहनत करो, सफलता जरूर मिलेगी।",
            "जो लोग मेहनत करते हैं, वही सफलता का स्वाद चखते हैं।",
            "अपने सपनों को सच करने के लिए मेहनत करो, सफलता तुम्हारे कदमों में होगी।",
            "जो मेहनत करता है, वही सफलता पाता है।",
            "अपने सपनों को पूरा करने का जज्बा रखो, मेहनत रंग लाएगी।",
            "मुश्किलें आएंगी, पर मेहनत और हौंसलों से सब कुछ संभव है।"
        ))
        ,
        ShayariModule("Sad", listOf(
            "तेरे बिना ये दिल अधूरा सा लगता है, तेरा साथ ही तो मेरे जीने का सहारा है।",
            "दर्द की इन रातों में तेरा ख्याल आता है, हर आहट पर तेरा नाम जुबां पर आता है।",
            "तेरी यादें सताती हैं, आँसू बनकर आँखों से बह जाती हैं।",
            "जिंदगी का हर पल उदास सा लगता है, तेरे बिना ये दिल तन्हा सा लगता है।",
            "तू नहीं तो कुछ भी अच्छा नहीं लगता, ये दिल बस तुझे ही ढूंढता है।",
            "तेरे बिना ये रातें अधूरी हैं, तेरे बिना ये जिंदगी अधूरी है।",
            "तेरी यादों का सहारा है, वरना ये दिल बहुत बेचारा है।",
            "दर्द दिल का इतना गहरा है, कि अब तो आँसू भी थक गए हैं।",
            "तेरे बिना ये जहाँ वीरान सा लगता है, हर जगह तेरा ही चेहरा नजर आता है।",
            "तेरी यादों का बसेरा है, इस दिल को अब तेरा ही सहारा है।",
            "दर्द दिल का कहें किससे, ये दिल अब तुझसे ही जुड़ा है।",
            "तेरे बिना ये दिल नहीं लगता, तेरा ही नाम जुबां पर रहता है।",
            "हर आहट में तेरा ही नाम आता है, हर लम्हा तुझे ही याद करता है।",
            "तेरे बिना ये दिल रोता है, हर पल तुझे ही याद करता है।",
            "दर्द दिल का ऐसा है, कि अब तो जीने का मन नहीं करता।"
        ))

    )
}