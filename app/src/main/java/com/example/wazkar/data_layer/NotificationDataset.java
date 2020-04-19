package com.example.wazkar.data_layer;

import java.util.Random;

public class NotificationDataset {

public static String getNof (){



// TODO array of notification

    String[] nof = {"قال رسول الله صلى الله عليه وسلم: (كُلُّ أُمَّتي يَدْخُلُونَ الجَنَّةَ إِلَّا مَن أَبَى، قالوا: يا رَسُولَ اللَّهِ، وَمَن يَأْبَى؟ قالَ: مَن أَطَاعَنِي دَخَلَ الجَنَّةَ، وَمَن عَصَانِي فقَدْ أَبَى)\n" +
            "صحيح البخاري\n",

            "قال رسول الله صلى الله عليه وسلم: (خَيْرُكُمْ مَن تَعَلَّمَ القُرْآنَ وعَلَّمَهُ)\n" +
                    "صحيح البخاري\n"
            ,


            "قال رسول الله صلى الله عليه وسلم: (مَن تَرَكَ صَلَاةَ العَصْرِ حَبِطَ عَمَلُهُ)\n" +
                    "صحيح البخاري\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (لَعَنَ رَسولُ اللَّهِ صَلَّى اللهُ عليه وسلَّمَ المُتَشَبِّهِينَ مِنَ الرِّجَالِ بالنِّسَاءِ، والمُتَشَبِّهَاتِ مِنَ النِّسَاءِ بالرِّجَالِ)\n" +
                    "صحيح البخاري\n"
            ,

            "قال رسول الله صلى الله عليه وسلم: (سَيِّدُ الِاسْتِغْفارِ أنْ تَقُولَ: اللَّهُمَّ أنْتَ رَبِّي لا إلَهَ إلَّا أنْتَ، خَلَقْتَنِي وأنا عَبْدُكَ، وأنا علَى عَهْدِكَ ووَعْدِكَ ما اسْتَطَعْتُ، أعُوذُ بكَ مِن شَرِّ ما صَنَعْتُ، أبُوءُ لكَ بنِعْمَتِكَ عَلَيَّ، وأَبُوءُ لكَ بذَنْبِي فاغْفِرْ لِي، فإنَّه لا يَغْفِرُ الذُّنُوبَ إلَّا أنْتَ)\n" +
                    "صحيح البخاري\n" +
                    ""

            ,
            "قال رسول الله صلى الله عليه وسلم: (المُسْلِمُ مَن سَلِمَ المُسْلِمُونَ مِن لِسانِهِ ويَدِهِ، والمُهاجِرُ مَن هَجَرَ ما نَهَى اللَّهُ عنْه)\n" +
                    "صحيح البخاري\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (الْمُؤْمِنُ القَوِيُّ، خَيْرٌ وَأَحَبُّ إلى اللهِ مِنَ المُؤْمِنِ الضَّعِيفِ، وفي كُلٍّ خَيْرٌ احْرِصْ علَى ما يَنْفَعُكَ، وَاسْتَعِنْ باللَّهِ وَلَا تَعْجَزْ، وإنْ أَصَابَكَ شيءٌ، فلا تَقُلْ لو أَنِّي فَعَلْتُ كانَ كَذَا وَكَذَا، وَلَكِنْ قُلْ قَدَرُ اللهِ وَما شَاءَ فَعَلَ، فإنَّ لو تَفْتَحُ عَمَلَ الشَّيْطَانِ)\n" +
                    "صحيح مسلم\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (إنَّ اللَّهَ يَرْفَعُ بهذا الكِتَابِ أَقْوَامًا، وَيَضَعُ به آخَرِينَ)\n" +
                    "صحيح مسلم\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (مَن حَفِظَ عَشْرَ آياتٍ مِن أوَّلِ سُورَةِ الكَهْفِ عُصِمَ مِنَ الدَّجَّالِ)\n" +
                    "صحيح مسلم\n"


            ,
            "روى ابن حبان في صحيحه عن أبي هريرة رضي الله عنه أن رسول الله صلى الله عليه وسلم قال : ( إذا صلت المرأة خمسها ، وصامت شهرها ، وحصنت فرجها ، وأطاعت زوجها ، قيل لها: أدخلي الجنة من أي أبواب الجنة شئت )\n" +
                    "صحيح البخاري\n"
            ,

            "عن أبي أمامة الباهلي رضي الله عنه قال : قال رسول الله صلى الله عليه وسلم : ( من قرأ آية الكرسي في دبر كل صلاة لم يحل بينه وبين دخول الجنة إلا الموت )\n" +
                    "صحيح البخاري\n"
            ,
            "عن أنس رضي الله عنه قال: \"مر النبي صلى الله عليه وسلم بتمرة في الطريق قال لولا أني أخاف أن تكون من الصدقة لأكلتها\".\n" +
                    "صحيح البخاري\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: \"إذا شرب أحدكم فلا يتنفس في الإناء وإذا أتى الخلاء فلا يمس ذكره بيمينه ولا يتمسح بيمينه\"\n" +
                    "صحيح البخاري\n" +
                    "" +
                    ""
            ,
            "\"عن عائشة رضي الله عنها أن رسول الله صلى الله عليه وسلم كان إذا أخذ مضجعه نفث في يديه وقرأ بالمعوذات ومسح بهما جسده\"\n" +
                    "صحيح البخاري\n" +
                    ""
            ,
            "الإكثار من الدعاء قبل التسليم عن عبدالله بن عمر قال : كنا إذا كنا مع النبي صلى الله عليه وسلم إلى أن قال : ثم ليتخير من الدعاء أعجبه إليه فيدعو\n" +
                    "صحيح البخاري\n"


            ,
            "عن النبي صلى الله عليه وسلم قال لا يؤمن أحدكم حتى يحب لأخيه ما يحب لنفسه\n" +
                    "صحيح البخاري\n"

            ,
            "عن النبي صلى الله عليه وسلم قال: \"من نسي صلاة فليصل إذا ذكرها لا كفارة لها إلا ذلك وأقم الصلاة لذكري\"\n" +
                    "صحيح البخاري\n"

            ,
            "حديث ابْنُ عَبّاسٍ أَنَّ النَّبِيَّ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ بَعَثَ مُعاذًا إِلى الْيَمَنِ فَقالَ: اتَّقِ دَعْوَةَ المَظْلُومِ فَإِنَّها لَيْسَ بَيْنَها وَبَيْنَ اللهِ حِجابٌ\n" +
                    "متفق عليه\n"

            ,
            "روي أنّ - النبي صلى الله عليه وسلم - قال:" +
                    " (ما يصيبُ المؤمنَ من وصبٍ ، ولا نصبٍ ، ولا سقمٍ ، ولا حَزنٍ ،" +
                    " حتَّى الهمَّ يُهمُّه، إلَّا كفَّر به من سيِّئاتِه)"
            ,
            "روى البخاري بسندٍ صحيح أن - النبي صلى الله عليه وسلم - قال: (ما مِن مصيبةٍ تصيبُ المسلِمَ إلَّا كفَّرَ اللَّهُ بِها عنهُ ، حتَّى الشَّوكةِ يُشاكُها)"

            ,
            "روي أنَّ النبي - صلى الله عليه وسلم - قال: (ما يزالُ البلاءُ بالمؤمنِ والمؤمنةِ في نفسِه وولدِه ومالِه حتَّى يلقَى اللهَ تعالَى وما عليه خطيئةٌ)."


            ,
            "قد رُوي في الصحيح عن رسول الله - صلى الله عليه وسلم - أنه قال: (إنَّ العبدَ إذا سبقت له من اللهِ منزلةٌ لم يبلغْها بعمله ابتلاه اللهُ في جسدِه أو في مالِه أو في ولدِه ثم صبَّره على ذلك حتى يُبلِّغَه المنزلةَ التي سبقت له من اللهِ تعالى)\n"


            ,
            "روي في الصحيح عن سعد بن أبي وقاص - رضي الله عنه - أنه قال: (قلتُ يا رسولَ اللهِ أيُّ النَّاسِ أشدُّ بلاءً قالَ الأَنبياءُ ثمَّ الأَمثلُ فالأَمثلُ ؛ يُبتلَى الرَّجلُ علَى حسَبِ دينِهِ ، فإن كانَ في دينِهِ صلبًا اشتدَّ بلاؤُهُ، وإن كانَ في دينِهِ رقَّةٌ ابتليَ علَى قدرِ دينِهِ، فما يبرحُ البلاءُ بالعبدِ حتَّى يترُكَهُ يمشي علَى الأرضِ وما علَيهِ خطيئةٌ"
            ,
            "قول النبي صلّى الله عليه وسلم: (عَجَبًا لِأَمْرِ المؤمنِ؛ إنَّ أمرَهُ كلَّه له خيرٌ، وليس ذلك لأحَدٍ إلَّا للمؤمنِ؛ إنْ أصابَتْه سرَّاءُ شَكَرَ فكان خيرًا له، وإن أصابَتْه ضَرَّاءُ صَبَرَ فكان خيرًا له)\n"
            ,
            "قال رسول الله صلّى الله عليه وسلّم: (لا حسَدَ إلَّا في اثنتيْنِ: رجلٌ آتاهُ اللهُ مالًا، فسلَّطَهُ على هلَكتِه في الحقِّ، ورجلٌ آتاهُ اللهُ الحِكمةَ، فهوَ يقضِي بِها، ويُعلِّمُها)\n"
            ,
            "عن جابر بن عبد الله -رضي الله عنه- قال: قال رسول الله صلّى الله عليه وسلم: (سلُوا اللهَ علمًا نافعًا، وتَعَوَّذُوا باللهِ منْ علمٍ لا ينفعُ)\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (فضلُ العلْمِ أحبُّ إِلَيَّ مِنْ فضلِ العبادَةِ، وخيرُ دينِكُمُ الورَعُ)"
            ,
            "قال رسول الله صلّى الله عليه وسلّم: (سيأتيكُم أقوامٌ يطلبونَ العِلمَ فإذا رأيتُموهم فقولوا لَهُم مَرحبًا مَرحبًا بوصيَّةِ رسولِ اللَّهِ صلَّى اللَّهُ عليهِ وسلَّمَ واقْنوهُم)\n"

            ,
            "قال رسول الله صلّى الله عليه وسلّم: (بَلِّغُوا عَنِّي ولو آيَةً، وَحَدِّثُوا عن بَنِي إِسْرَائِيلَ وَلَا حَرَجَ، وَمَن كَذَبَ عَلَيَّ مُتَعَمِّدًا، فَلْيَتَبَوَّأْ مَقْعَدَهُ مِنَ النَّارِ)\n"
            ,
            "قال رسول الله صلّى الله عليه وسلّم: (ما اجتمَعَ قومٌ في بيتٍ من بيوتِ اللَّهِ يتلونَ كتابَ اللَّهِ، ويتدارسونَهُ فيما بينَهم إلَّا نزلَت عليهِم السَّكينةُ، وغشِيَتهُمُ الرَّحمةُ، وحفَّتهُمُ الملائكَةُ، وذكرَهُمُ اللَّهُ فيمَن عندَهُ)\n"
            ,
            "عن ابن مسعود - رضي الله عنه - عن النَّبيّ - صلى الله عليه وسلم - قَالَ: «إنَّ الصِّدقَ يَهْدِي إِلَى البرِّ، وإنَّ البر يَهدِي إِلَى الجَنَّةِ، وإنَّ الرَّجُلَ لَيَصدُقُ حَتَّى يُكْتَبَ عِنْدَ اللهِ صِدِّيقًا. وَإِنَّ الكَذِبَ يَهْدِي إِلَى الفُجُورِ، وَإِنَّ الفُجُورَ يَهدِي إِلَى النَّارِ، وَإِنَّ الرَّجُلَ لَيَكْذِبُ حَتَّى يُكتَبَ عِنْدَ الله كَذَّابًا»\n" +
                    " مُتَّفَقٌ عَلَيهِ\n"

            ,
            "عن أبي ثابت، وقيل: أبي سعيد، وقيل: أبي الوليد، سهل ابن حُنَيْفٍ وَهُوَ بدريٌّ  رضي الله عنه: أنَّ النَّبيّ - صلى الله عليه وسلم - قَالَ: «مَنْ سَأَلَ اللهَ تَعَالَى الشَّهَادَةَ بِصِدْقٍ بَلَّغَهُ مَنَازِلَ الشُّهَدَاءِ وَإِنْ مَاتَ عَلَى فِرَاشِهِ» \n" +
                    " رواه مسلم\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (أَرْبَعٌ مَن كُنَّ فيه كانَ مُنَافِقًا خَالِصًا، وَمَن كَانَتْ فيه خَلَّةٌ منهنَّ كَانَتْ فيه خَلَّةٌ مِن نِفَاقٍ حتَّى يَدَعَهَا: إِذَا حَدَّثَ كَذَبَ، وإذَا عَاهَدَ غَدَرَ، وإذَا وَعَدَ أَخْلَفَ، وإذَا خَاصَمَ فَجَرَ)\n"
            ,
            "عن أبي هريرة رضي الله عنه قال: قال رسول الله صلى الله عليه وسلم: (سيَأتي علَى النَّاسِ سنواتٌ خدَّاعاتُ يصدَّقُ فيها الكاذِبُ ويُكَذَّبُ فيها الصَّادِقُ ويُؤتَمنُ فيها الخائنُ ويُخوَّنُ فيها الأمينُ وينطِقُ فيها الرُّوَيْبضةُ قيلَ وما الرُّوَيْبضةُ قالَ الرَّجلُ التَّافِهُ في أمرِ العامَّةِ)\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (بدأ الإسلامُ غريبًا وسيعودُ غريبًا كما بدأ فطُوبِى للغرباءِ، وفي روايةٍ قيل يا رسولَ اللهِ: مَن الغرباءُ؟ قال: الذين يصلحون إذا فسد الناسُ، وفي لفظٍ آخرَ قال: هم الذين يُصلِحون ما أفسد الناسُ من سنتي)\n" +
                    " [صحيح]\n"
            ,
            "عن عبد الله بن مسعود رضي الله عنه قال : سألت رسول الله صلى الله عليه وسلم : أي العمل أحب إلى الله ؟ قال : \" الصلاة على وقتها \" . قلت : ثم أي ؟ قال : \" بر الوالدين \" . قلت : ثم أي ؟ قال : \" الجهاد في سبيل الله \"\n" +
                    "متفق عليه\n"

            ,
            "عن أبى هريرة رضي الله عنه قال : جاء رجل إلى رسول الله صلى الله عليه وسلم فقال : من أحق الناس بحسن صحابتي قال : \" أمك \". قال ثم من قال : \" ثم أمك \" . قال ثم من قال : \" ثم أمك \" . قال ثم من قال \" ثم أبوك \"\n"

            ,
            "عن عبد الله بن عمرو رضي الله عنه قال : جاء رجل إلى رسول الله صلى الله عليه وسلم فقال : جئت أبايعك على الهجرة ، وتركت أبوي يبكيان ، فقال : \" ارجع إليهما فأضحكهما كما أبكيتهما \" \n" +
                    " أخرجه أحمد وأبو داود والنسائي وابن ماجه وصححه الألباني\n"

            ,
            "عن أبي هريرة رضي الله عنه قال : قال رسول الله صلى الله عليه و سلم : \" ثلاث دعوات مستجابات لا شك فيهن : دعوة الوالد على ولده ، ودعوة المظلوم ، ودعوة المسافر \" \n" +
                    " أخرجه البخاري في الأدب المفرد وأحمد وأبو داود والترمذي وابن ماجه وحسنه الألباني "
            ,
            "قال رسول اللهِ صلّى اللهُ عليهِ وسلَّم: (إِنَّ الله يُحِبُ إذا عَمِل أحَدُكُم عَمَلا أنْ يُتْقِنَه)\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (كُلُّكُم راعٍ وكُلُّكُم مسؤولٌ عن رعيتهِ)\n"

            ,
            "(سُئِلَتْ عائِشةُ عن خُلُقِ رسولِ اللهِ صلَّى اللهُ عليه وسلَّمَ، فقالَتْ: كان خُلُقُه القُرآنَ)\n"
            ,
            "(سُئِلَ البَرَاءُ أكانَ وجْهُ النبيِّ صَلَّى اللهُ عليه وسلَّمَ، مِثْلَ السَّيْفِ؟ قَالَ: لا بَلْ مِثْلَ القَمَرِ)\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (الَّذي يقرأُ القرآنَ وهو ماهرٌ به مع السَّفَرةِ الكِرامِ البَررةِ، والَّذي يقرأُ القرآنَ وهو عليه شاقٌّ فله أجران)\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (اقْرَؤُوا القُرْآنَ فإنَّه يَأْتي يَومَ القِيامَةِ شَفِيعًا لأَصْحابِهِ).\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (مَثَلُ المُؤْمِنِ الذي يَقْرَأُ القُرْآنَ، مَثَلُ الأُتْرُجَّةِ، رِيحُها طَيِّبٌ وطَعْمُها طَيِّبٌ، ومَثَلُ المُؤْمِنِ الذي لا يَقْرَأُ القُرْآنَ مَثَلُ التَّمْرَةِ، لا رِيحَ لها وطَعْمُها حُلْوٌ)\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (يقالُ لصاحِبِ القرآنِ: اقرأْ وارقَ ورتِّلْ، كما كنتَ تُرَتِّلُ في دارِ الدنيا، فإِنَّ منزِلَتَكَ عندَ آخِرِ آيةٍ كنتَ تقرؤُها)\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (إنَّ الذي ليسَ في جوفِهِ شيءٌ من القرآنْ كالبيتِ الخَرِبِ)\n"

            ,
            "قال رسول الله صلى الله عليه وسلم: (مَن تَوَضَّأَ لِلصَّلَاةِ فأسْبَغَ الوُضُوءَ، ثُمَّ مَشَى إلى الصَّلَاةِ المَكْتُوبَةِ، فَصَلَّاهَا مع النَّاسِ، أَوْ مع الجَمَاعَةِ، أَوْ في المَسْجِدِ غَفَرَ اللَّهُ له ذُنُوبَهُ)\n"
            ,
            "قال رسول الله صلى الله عليه وسلم: (لا يَتَوَضَّأُ رَجُلٌ مُسْلِمٌ فيُحْسِنُ الوُضُوءَ فيُصَلِّي صَلاةً إلَّا غَفَرَ اللَّهُ له ما بيْنَهُ وبيْنَ الصَّلاةِ الَّتي تَلِيها)"

            ,
            "قال رسول الله صلى الله عليه وسلم: (كَلِمَتانِ خَفِيفَتانِ علَى اللِّسانِ، ثَقِيلَتانِ في المِيزانِ، حَبِيبَتانِ إلى الرَّحْمَنِ، سُبْحانَ اللَّهِ وبِحَمْدِهِ، سُبْحانَ اللَّهِ العَظِيمِ)\n"

            ,
            "عن عمر بن الخطاب - رضي الله عنه - قال : سمعت رسول الله (صلي الله عليه وسلم) يقول \" انما الاعمال بالنيات وانما لكل امرئ ما نوي فمن كانت هجرته الي الله ورسوله فهجرته الي الله ورسوله ومن كانت هجرته لدنيا يصيبها او امراة ينكحها فهجرته الي ما هاجر اليه \"\n"


            ,
            "عن جابر – رضي الله عنه – قال : قال رسول الله ( صلي الله عليه وسلم ) \" مثل الصلوات الخمس كمثل نهر جار غمر علي باب أحدكم يغتسل منه كل يوم خمس مرات "

            ,
            "عن أبي سعيد رضي الله عنه أن النبي صلى الله عليه وسلم قال: أيها الناس: إن ربكم واحد، وإن أباكم واحد، ألا لا فضل لعربي على أعجمي ولا لعجمي على عربي ولا لأحمر على أسود وأسود على أحمر إلا بالتقوى\n" +
                    " رواه أحمد\n"
            ,
            "عن عائشة رضي الله عنها قالت: كان رسول الله صلى الله عليه وسلم إذا تضور من الليل قال: لا إله إلا الله الواحد القهار، رب السموات والأرض وما بينهما العزيز الغفار\n" +
                    " رواه النسائي في عمل اليوم والليلة، وفي الكبرى، وصححه الألباني\n"

            ,
            "قال صلى الله عليه وسلم: ((ما من شيء في الميزان أثقل من حسن الخلق)) \n" +
                    "رواه الترمذي (2002)\n"
            ,
            "قال صلى الله عليه وسلم: ((إن الرجل ليدرك بحسن خلقه درجات قائم الليل صائم النهار))\n" +
                    " رواه أبو داود (4798)\n"
            ,
            "رُوِي عن أنس بن مالك أنّه قال: (كانَ رسولُ اللَّهِ صلَّى اللَّهُ عليهِ وسلَّمَ يقولُ اللَّهمَّ إنِّي أعوذُ بِكَ منَ العَجزِ والكسلِ والجبنِ والبخلِ والهرَمِ وأعوذُ بِكَ من عذابِ القبرِ وأعوذُ بِكَ من فِتنةِ المحيا والمماتِ)\n"

            ,
            "قال الرسول صلى الله عليه وسلم: (مَن نَفَّسَ عن مُسلِمٍ كُرْبةً من كُرَبِ الدُّنيا، نَفَّسَ اللهُ عنه كُرْبةً من كُرَبِ يومِ القيامةِ، ومَن يسَّرَ على مُعسِرٍ، يسَّرَ اللهُ عليه في الدُّنيا والآخِرةِ، ومَن سَتَرَ على مُسلِمٍ، سَتَرَ اللهُ عليه في الدُّنيا والآخِرةِ، واللهُ في عَونِ العَبدِ ما كان العَبدُ في عَونِ أخيهِ. قال أبو داودَ: لم يذكُرْ عُثمانُ، عن أبي مُعاويةَ: ومَن يسَّرَ على مُعسِرٍ)\n"
            ,
            "قال الرسول صلى الله عليه وسلم: (إنَّ اللَّهَ حَرَّمَ علَيْكُم: عُقُوقَ الأُمَّهَاتِ، ووَأْدَ البَنَاتِ، ومَنَعَ وهَاتِ، وكَرِهَ لَكُمْ قيلَ وقالَ، وكَثْرَةَ السُّؤَالِ، وإضَاعَةَ المَالِ)\n"
            ,// TODO kwatarnof
            "﴿وَما أَمرُ السّاعَةِ إِلّا كَلَمحِ البَصَرِ أَو هُوَ أَقرَبُ إِنَّ اللَّهَ عَلى كُلِّ شَيءٍ قَديرٌ﴾\n" +
                    "في لمح البصر \n" +
                    "يتغير الكون ، وتقوم الساعه فما بالك بشدتك وضيقك وحزنك\n" +
                    "أضواء الفرج قريبة \n"
            ,
            "إِنَّ اللَّهَ وَمَلَائِكَتَهُ يُصَلُّونَ عَلَى النَّبِيِّ ۚ \n" +
                    " يَا أَيُّهَا الَّذِينَ آمَنُوا صَلُّوا عَلَيْهِ وَسَلِّمُوا تَسْلِيمًا  ﷺ\n"
            ,
            "\" حتى إِذَا ركِبا فِي السَّفِينةِ خَرقَها \"\n" +
                    "قد يكون في خرق سفينتك نجاتك\n"

            ,
            "\"إن لم يكن بك عليَّ غضبٌ فلا أبالي\".\n" +
                    "طاعة الله مفتاح رضاه واتقاء غضبه، ورضا الله وحده هو سبب رضا العبد وسعادة القلب\n"

            ,
            "\"الحمد لله الذي ردّ عليَّ روحي.\n" +
                    "وعافاني في بدني.\n" +
                    "وأذِن لي بذكره\".\n" +
                    "تذكروا النعم المنسية\n"

            ,
            "أستغفرك من يأسي حين طال البلاء.\n" +
                    "ومن سوء ظني حين تكالب الأعداء.\n" +
                    "ومن نسيان سوابق الإحسان عند تأخر العطاء\n"
            ,
            "قلَّت في المساجد الصفوف.\n" +
                    "ورجعت المصاحف إلى الرفوف.\n" +
                    "وبقيتَ أنتَ على العهد وفيا، ولازلت ذاكرا لربك بكرة وعشيا، فكنتَ عند ربك مرضيا.\n" +
                    "#افتح_مصحفك\n"

            ,
            "كان النبي ﷺ يقرؤها كل ليلة مع خواتيم سورة البقرة:\n" +
                    "(ربنا ولا تحمِّلنا ما لا طاقة لنا به).\n" +
                    "ربما كان صبرك على البلاء بسبب محافظتك على هذا الدعاء!\n"

            ,
            "أول فهم الواقع عن طريق الصلة بالقرآن.\n" +
                    "وأول الاتصال به: قراءة آياته، ثم تدبرها لفهم حلول الوحي لمشكلات الواقع.\n" +
                    "عند هجر القرآن، يضل الإنسان طريق السكينة ويفقد الأمان.\n" +
                    "#افتح_مصحفك\n"

            ,
            "فتح مصحفك اليوم يُبقي ما بينك وبين القرآن عامرا، وينزع عنك وصف الجفاء، ويعينك على حفظ عهد الثبات\n"

            ,
            "(سلام هي حتى مطلع الفجر)..\n" +
                    "معناها:\n" +
                    "تشبَّث بكل لحظة قبل الرحيل!\n"

            ,
            "لا ترفعْ دعاءك على مظنة الإجابة، بل على اليقين بالإجابة.\n" +
                    "الله عند ظن عبده به، والله ما عوَّدك إلا خيرا\n"

            ,
            "كيف اصل الي السلام الداخلي ؟\n" +
                    "أن تعرف الله , فتحبه وترجوه وتخافه \n"
            ,
            "\"وكذلك جعلناكم أمةً وسَطاً\"\n" +
                    "ضاع هذا الدين بين الغالى فيه والمجافى عنه\"\n" +
                    "الغالى صاحب إفراط والجافى صاحب تفريط\n"
            ,
            "حين تكون أقصى طموحات نبي :\n" +
                    "\" توفني مسلما \" ، تعلم أن أفضل النعم : الثبات على الدين\n"
            ,
            "ما أتعس من أضاع عمره و ما عرف ربه\n" +
                    "ولو عرف ربه لأحبه\n" +
                    "و لو أحبه ما آثر عليه غيره"

            ,
            "قال لصاحبه : شوقني الي الجنة ؟\n" +
                    "\n" +
                    "فأجاب : إذا كانت اول غمسة فيها تمحو من الذاكرة ألوان العذاب ، وبؤس الحياة ، فكيف بعيش الأبد ؟!!\n"
            ,
            "أعانَ الله موسى وهارون في مواجهة طغيان فرعون بسلاح الذِّكر: ﴿ولا تنيا في ذكري﴾.\n" +
                    "فقوة النفس في استعانتها بالله القوي العزيز\n"

            ,
            "وكم صرف الله عنك مِنَ الأذى الخفي، وأنت بضعف بصيرتك تبكي على فقدانه كالصبي!\n"
            ,
            "لو انكشف عنك حجاب الغيب، فرأيتٓ ما دفع الدعاء من بلاء وأورث من ثواب، لما فتر لسانك عن الدعاء، ولو لم يتحقق ما دعوتٓ به\n"

            ,
            "إن لم يكن بك عليَّ غضبٌ فلا أبالي" +
                    "طاعة الله مفتاح رضاه واتقاء غضبه، ورضا الله وحده هو سبب رضا العبد وسعادة القلب"

            ,
            "أغلى الأمنيات وأعظم المستحيلات:\n" +
                    "زيادة دقيقة واحدة في عُمْر من مات" +
                    "فكم بين يديك اليوم من ساعات، يحسدك عليها الأموات، فلا تبددها فتكون عليك حسرات\n"
            ,
            "أستغفرك من يأسي حين طال البلاء.\n" +
                    "ومن سوء ظني حين تكالب الأعداء" +
                    "ومن نسيان سوابق الإحسان عند تأخر العطاء\n"

            ,
            "هل فتحت مصحفك اليوم؟!\n"

            , "" +
            "كان النبي ﷺ يقرؤها كل ليلة مع خواتيم سورة البقرة:" +
            "(ربنا ولا تحمِّلنا ما لا طاقة لنا به)" +
            "ربما كان صبرك على البلاء بسبب محافظتك على هذا الدعاء!"

            ,
            "أول فهم الواقع عن طريق الصلة بالقرآن.\n" +
                    "وأول الاتصال به: قراءة آياته، ثم تدبرها لفهم حلول الوحي لمشكلات الواقع.\n" +
                    "لذا عند هجر القرآن، يضل الإنسان طريق السكينة ويفقد الأمان"

            ,
            "فتح مصحفك اليوم يُبقي ما بينك وبين القرآن عامرا، وينزع عنك وصف الجفاء، ويعينك على حفظ عهد الثبات.\n"
            ,
            "(سلامّ هي حتى مطلع الفجر)..\n" +
                    "معناها:\n" +
                    "تشبَّث بكل لحظة قبل الرحيل!\n"
            ,
            "اللهم غيِّر حالنا مِنْ أمة (كغثاء السيل) إلى (خير أمة أخرِجت للناس)، واجعلنا من أسباب هذا التغيير.\n"
            ,

            "ذاكر الله في الغافلين كالشجرة الخضراء وسط الهشيم.\n" +
                    "وكالمقاتل الشجاع بين الفارِّين.\n" +
                    "وهو تاج الصادقين.\n"

            ,
            "كم واحداً ذكرته بالأمس في دعائك؟!\n" +
                    "صاحب القلب الحي يتألم لغيره، فيدعو له.\n" +
                    "وموتى القلوب لا يذكرون في دعائهم إلا أنفسهم: (أهمّتهم أنفسهم)\n"
            ,
            "لمن طال بهم زمن البلاء:\n" +
                    "تعامل مع البلاء على أنه سبب النجاة، وأنه لولا ثواب الصبر عليه، لما اجتزت الصراط، ولا عبرت إلى الجنة.\n" +
                    "وإن فاتك أن تسبق غيرك بصالح الأعمال، فقد تجاوزت الجميع بصبرك على كل الأحوال\n"


            ,
            "مع انقضاء دعائك كل ليلة، تفاءل وقل لنفسك:\n" +
                    "قد أجيبت الدعوات، فأبشِر بما هو آت.\n"
            ,
            "﴿قَالَتْ يَالَيْتَنِي مِتُّ قَبْلَ هَذَا وَكُنْتُ نَسْيًا مَنْسِيًّا (23) فَنَادَاهَا مِنْ تَحْتِهَا أَلَّا تَحْزَنِي﴾:\n" +
                    "عند أقصى اشتدادٍ للأزمة، يُرسِل الله إليك بشائر الفرَج ولطائف القدَر.\n"
            ,
            "لا ترفعْ دعاءك على مظنة الإجابة، بل على اليقين بالإجابة.\n" +
                    "الله عند ظن عبده به، والله ما عوَّدك إلا خيرا.\n"
            ,
            "حريصون نحن على صيانة صورتنا أمام الناس حفاظا على سُمْعتنا.\n" +
                    "ليتنا نحرص هذا الحرص مع الله.\n"

            ,
            "اللهم ..\n" +
                    "أغنني بك عمن سواك.\n" +
                    "أرضني برضاك عني، فلا آسى على فقدان شيء.\n" +
                    "آنِس وحشة روحي بلذة القرب منك\n"

            ,
            "ساعة بعد نزول الفرَج تنسي سنوات من الألم، فماذا عن أول ساعة بعد دخول الجَنة؟!\n"
            ,
            "من أعان ظالما سلّطه الله عليه، فكيف بما ينتظره غدا من عذاب حين يرجع إلى الله موقوفا بين يديه؟!\n"
            ,
            "يا محتاج..\n" +
                    "لا ترفع رأسك الليلة من سجودك قبل أن تشعر بروح الإجابة.\n"

            ,
            "\"من أخفى عن الناسِ -همّه- متوكلاً على الله كفاهُ الله ما أهمّهُ وأرضاه. \"\n"

            ,
            "مفتاح الرضا:\n" +
                    "معرفة العبد أن اختيار الله له خيرٌ من اختياره لنفسه\n"

            ,
            "اللهم لا تشغل قلوبنا بما ضمِنتَه لنا عما خلقتنا له.\n"

            ,
            "سبحان من جعل من بعض الكلام -وهو أيسر شيء على الإنسان- دواء أو داء للقلوب، وشفاء للصدور.\n" +
                    "القرآن دواء.\n" +
                    "وذكر الناس داء.\n"

            ,
            "\"ومن اليقين ما تهوِّن به عَلِينا مصائب الدنيا\"\n" +
                    "من عظمت مصيبته في عينه، فهي علامة نقصان اليقين في قلبه"

            ,
            "قال ابن عمر رضي الله عنهما:\n" +
                    "\"لكل مؤمن دعوة مستجابة عند إفطاره، إما أن يعجَّل في دنياه، أو يُدَّخَر في آخرته"

            ,
            "حين تسمع دعاء النبي ﷺ:\n" +
                    "\"اللهمَّ لا عيش إلا عيش الآخرة\".\n" +
                    "كيف تأسى على ما فات من دنياك، أو تستسلم لما نزل من بلاياك!\n"


            ,
            "«صلاة الرجل تطوعا حيث لا يراه الناس تعدل صلاته على أعين الناس خمسا وعشرين» صحيح الجامع رقم: 3821\n"

            ,

            "﴿قد جاءكم بصائرُ من ربكم﴾\n" +
                    "ضلال البعض اليوم، وحيرتهم تجاه تفسير الأحداث الجارية سببه: هجر القرآن قراءة وتدبرا\n"
            ,
            "ﻗﺎﻝ ﺣﺬﻳﻔﺔ ﺑﻦ ﺍﻟﻴﻤﺎﻥ:\n" +
                    " «ﻟﻴﺄﺗﻴﻦ ﻋﻠﻰ ﺍﻟﻨﺎﺱ ﺯﻣﺎﻥ ﻻ ﻳﻨﺠﻮ ﻓﻴﻪ ﺇﻻ ﺍﻟﺬﻱ ﻳﺪﻋﻮ ﺑﺪﻋﺎﺀ ﻛﺪﻋﺎﺀ ﺍﻟﻐﺮﻳﻖ»\n"
            ,
            "الفتنة تحوِّل بعض العمالقة أقزاما، وتحوِّل من ظنهم الناس أقزاما إلى عمالقة.\n"

            ,
            "(يومئذ يتذكر الإنسان وأنّى له الذكرى).\n" +
                    "اللهم ارزقنا تذكر أسباب النجاة قبل فوات الأوان.\n" +
                    "وانتشِلنا من دائرة الغفلة والنسيان\n"

            ,
            "\"فطوبى للغرباء\":\n" +
                    "القابضين على جمر الحق مهما كانت التبعات.\n" +
                    "السائرين على خطى الأنبياء مهما واجهوا العقبات\n"
            ,

            "قال ابن تيمية:\n" +
                    "«ومعصيةُ الكِبْر والعُجْب والرياء أعظمُ من معصية شُرْب الخمر، فالشارب الخاشع" +
                    " الخائف من ربه أقرب إلى رحمة ربه من الصائم المتكبِّر المُعْجَب المُرائي»\n"

            ,
            "اربح ساعات من العبادة عن طريق نية يسيرة!\n" +
                    "نم الليلة بنية التقوي على الاستيقاظ في السَّحَر للسحور، والاستغفار، وقيام الليل لمن كان من صفوة الأبرار\n"
            ,
            "من خاف زلة القدم بعد الثبات، فليجعل له حظا من عبادة السر والقُرُبات، وليحرِص عليها حتى الممات.\n"

            ,
            "في غمرة الآلام قد ننسى أن المصائب اختبارات يقين، وسبب تمايز المؤمنين:\n" +
                    "ومن اليقين ما تهوِّن به علينا مصائب الدنيا\n"
            ,
            "سعادة العبد بما ربح من رضا مولاه، كفيلة بأن تمحو حزنه على ما فقد من دنياه\n" +
                    "إن لم يكن بك عليَّ غضب فلا أبالي\n"

            ,
            "غدا تكتشف أن الجَنة أغلى بكثير مما بذلت، ومن عاين روعة الجزاء تمنى لو ضاعف العطاء.\n"

            ,
            "﴿ فَمَنْ كانَ يَرْجُوا لِقاءَ رَبِّهِ فَلْيَعْمَلْ عَمَلًا صالِحاً وَلا يُشْرِكْ بِعِبادَةِ رَبِّهِ أَحَداً ﴾ [الكهف: 110]\n"

            ,
            "بعض الهموم استدعاءٌ إجباريٌ للعودة إلى الله، وتقديمِ رضاه على ما سواه.\n"
            ,
            "(إذ يقول لصاحبه لا تحزن إن الله معنا):\n" +
                    "لم يقل:\n" +
                    "لا تحزن فأنا رسول الله.\n" +
                    "فحتى خير الخلق تبرأ من حوله وقوته إلى حول ربه وقوته..\n" +
                    "فماذا عني وعنك؟!\n"
            ,
            "والله ما أطلق عبدٌ بصره إلا حُرِم الخشوع ابتداء والانتظام في الصلوات انتهاء!\n" +
                    "وأي شيء يبقى من دينك إذا ضاعت صلاتك؟!\n"
            ,
            "من ظنَّ أنه رجع من دعائه صفر اليدين، فما عرف ربه.\n"

            ,
            "اللهم اجعلني ممن يئس منهم اليأس.\n" +
                    "وخاف منهم الخوف.\n" +
                    "واستسلم لهم الاستسلام\n"
            ,
            "واذكره حين يغفل الناس عن ذكره، يذكرك حين يغفل الناس عن وجعك (فاذكروني أذْكُركُم)\n"
            ,
            "قال لي:\n" +
                    "للصبر حدود!\n" +
                    "قلت:\n" +
                    "وقد يكون بغير حدود، ففي الحديث:\n" +
                    "\"ومن يتصبّر يُصبِّره الله\".\n" +
                    "وما عند الله من زاد، لا ينفد مهما جاد منه على العباد!\n"
            ,
            "نشرك لمصائبك على صفحتك يُحزِن الصديق، ولا يُزيل الضيق.\n" +
                    "ما رأيك أن تجرِّب الشكوى إلى ربك بدلا منها إلى صحبك؟!\n"
            ,

            "استغفر الآن..\n" +
                    "في الحديث عن النبي ﷺ:\n" +
                    "\"ما أَصْبَحْتُ غَدَاةً قَطُّ إِلا اسْتَغْفَرْتُ الله فيها مائة مَرَّة\".\n" +
                    "رواه الطبراني في الأوسط، هو في السلسلة الصحيحة.\n" +
                    "والغداة: ما بين الفجر وشروق الشمس.\n"
            ,
            "آفة أكثر الخلق: عدم تحمل تبعات الحق لا في عدم تمييز الحق من الباطل.\n" +
                    "ادْعُ الله أن يعافيك من الآفتين:\n" +
                    "\"اللهم أرِنا الحق حقا، وارزقنا اتباعه\".\n"
            ,
            "وفِي لمح البصر، يغيِّر الله كل شيء..\n" +
                    "إن الله على كل شيء قدير\n"

            ,
            "وكما أن المصباح يحتاج إلى الزيت كي يضيء.\n" +
                    "فكذلك القلب في حاجة للقرآن كي يستضيء، ومن غفلته يستفيق\n"

            ,

            "لا تحسبوه شرا لكم بل هو خيرٌ لكم\n"

            ,
            "صلاتنا عليه بعض ثمن الوقوف غدا على الحوض بين يديه\n"
            ,
            "يا من بيده خزائن كل شيء..\n" +
                    "أفرِغ على قلوبنا سكينة ورضا..\n" +
                    "تهوِّن علينا كل شيء\n"

            ,
            "إذا أنعم الله عليك بنعمة، فثق أنها الأصلح لك، فلا تمدن عينيك إلى نعمة غيرك\n"

            ,
            "ألا يستفز جلَد الفجار وسعيهم به إلى النار.. ألا يستفز عجزَ الأبرار، ويستنهِض هِمَمهم نحو الجنة؟!\n"
            ,
            "لكل منا أحزان!\n" +
                    "لكن منا من ينحت جبل أحزانه بِمِعْوَل (القرآن) حتى يزيله.\n" +
                    "ومنا من يستسلم لأحزانه حتى تُهلِكه\n"

            ,
            "هل وجهت تحية المساء إلى شفيعك؟!\n" +
                    "هل صليت عليه عشر مرات؟!\n" +
                    "في الحديث:\n" +
                    "\"من صلى عليَّ حين يصبح عشرًا ، وحين يمسي عشرًا ، أدركته شفاعتي يوم القيامة\"\n"

            ,
            "﴿ إذ أعجبتكم كثرتكُمْ فلم تُغْنِ عنكم شيئا..﴾\n" +
                    "يا كل كاتب على صفحته أو حسابه:\n" +
                    "ما فائدة أن يُعجَب الناس بحلاوة كلامك، بينما يكره الله سوء أفعالك وأحوالك؟!\n"
            ,
            "ما أرحمك يا رب.\n" +
                    "تتكرم فتعطي.\n" +
                    "و تمنع فتحمي.\n" +
                    "فلك الحمد على كل حال\n"
            ,
            "من تعوّد التفريط في النوافل، ابتُلي بترك الفرائض!\n" +
                    "النوافل سدٌّ منيع في وجه زلل الأقدام وزيغ القلوب.\n" +
                    "اجعل لك نوافل لا تفرِّط بها مهما يكن.\n"
            ,
            "أشكو إلى الله كما قد شكى ...\n" +
                    "أولاد يعقوب إلى يوسف\n" +
                    "قد مسَّني الضُّرُّ وأنت الذي ...\n" +
                    "تعلم حالي وترى موقفي\n"


            ,
            "فرحك بما ربحت من آخرتك كفيلٌ بأن يغمر حزنك على ما خسرتَ من دنياك.\n" +
                    "في الحديث:\n" +
                    "\"ركعتا الفجر خير من الدنيا وما فيها\"\n"

            ,
            " ﴿ذَلِكَ تَأْوِيلُ مَا لَمْ تَسْطِعْ عَلَيْهِ صَبْرًا﴾[الكهف:82]:\n" +
                    "تعلَّم فن الانتظار، واستقبِل أحداث الحياة بطول التأمل ونظرات الاعتبار"

            ,
            "﴿ وَكانَ أبُوهُما صَالِحاً ﴾[الكهف:82]:\n" +
                    "تبلى عظامك، وتذروك الرياح، ولا يزال أثر صلاحك باقيا في دنيا الناس عن طريق ذريتك.. اللهم ارزقنا هذا النسل المبارك.\n"

            ,
            "﴿فأراد ربك أن يبلغا أشدهما ويستخرجا كنزهما رحمة من ربك﴾[الكهف:82]:\n" +
                    "قد يؤخِّر الله عنك الخير، لأنك لم تستعد لاستقباله بعد، ولو أتاك سريعا لفقدته سريعا، والدرس هنا: بعض التأخير فيه خير كثير\n"

            ,
            "ربما كان بلاؤك بعض دوائك.\n" +
                    "إذا كان سبب رجوعك إلى الله ومزيد اهتدائك.\n" +
                    "(ولنذيقنهم من العذاب الأدنى دون العذاب الأكبر لعلهم يرجعون).\n"
            ,
            "﴿فَلا تُصَاحِبْنِي﴾[الكهف:76]:\n" +
                    "إشارة إلى تواضع موسى عليه السلام، فقد رأى أن الرجل الصالح أعلى منه منْزِلة، وإلا لقال: (فلا أصاحبك) بدلا من قوله: (فلا تصاحبني)\n"
            ,

            "لم يعرف سبب وحشة قلبه وضيق صدره حتى فتح مصحفه اليوم!\n"
            ,
            "ابتلاؤك الذي صبرت عليه اليوم هو:\n" +
                    "ثمن الفرح والأمن الخالدين في الجنة غدا!\n"

            ,
            "ما رأيك أن تتخفف قليلا من متابعة الصفحات، لتحصِّل جرعات سكينة سماوية من الآيات؟\n"
            ,
            "(كلا بل لا يخافون الآخرة):\n" +
                    "لذا سيخافون في الآخرة!\n" +
                    "الخوف من الله اليوم سبب النجاة غدا.\n"
            ,
            "في الحديث:\n" +
                    "\"عجبا لأمر المؤمن، إن أمره كلَّه له خير\".\n" +
                    "دقِّق في قول النبي صلى الله عليه وسلم:\n" +
                    " \"كلَّه\".\n" +
                    "فحتى حُلمك الذي لم يكتمِل\n" +
                    "ودعاؤك الذي لم يُستَجب على الوجه الذي تريد.\n" +
                    "ورزقك الذي تأخَّر في الطريق.\n" +
                    "كل هذا خيرٌ لك دون أن تشعر\n"
            ,
            "(تولوا وأعينهم تفيض من الدمع حزنا ألا يجدوا ما ينفقون)\n" +
                    "(تفيض)وليس(تدمع)؛\n" +
                    "لشدة حزنهم على فوات طاعة الجهاد المفضي إلى الموت!\n" +
                    "اللهم صدقا كصدق هؤلاء\n"


    };
    int idx = new Random().nextInt(nof.length);
    String randomm = (nof[idx]);





return  randomm;

}


}