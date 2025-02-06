package com.saurabh.springdata.customer.constant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Constants {

	public static final List<String> CHARACTER_NAMES = List.of("Son Goku", "Prince Vegeta", "Naruto Uzumaki",
			"Sasuke Uchiha", "Luffy Monkey", "Ichigo Kurosaki", "Light Yagami", "Mikasa Ackerman", "Eren Yeager",
			"Tanjiro Kamado", "Nezuko Kamado", "Zenitsu Agatsuma", "Inosuke Hashibira", "Giyu Tomioka", "Shinobu Kocho",
			"Kanao Tsuyuri", "Satoru Gojo", "Kento Nanami", "Yuji Itadori", "Manjiro Sano (Mikey)",
			"Ken Ryuguji (Draken)", "Takemichi Hanagaki", "Hinata Tachibana", "Rika Furude", "Satoko Hojo",
			"Akame Sougetsu", "Aqua Hikariko", "Darkness Lalatina", "Megumin Explosion", "Hina Amano", "Miku Nakano",
			"Nino Nakano", "Ichika Nakano", "Yotsuba Nakano", "Itsuki Nakano", "Erza Scarlet", "Shizuku Sangou",
			"Kirari Momobami", "Shuuichi Shindou", "Koichi Hirose", "Kurisu Makise", "Mayuri Shiina", "Rintarou Okabe",
			"Eru Chitanda", "Sora Naegino", "Kazuma Satou", "Roronoa Zoro", "Sanji Vinsmoke", "Nico Robin",
			"Tony Tony Chopper", "Brook Soul", "Boa Hancock", "Usopp Sniper", "Shanks Red-Haired",
			"Trafalgar D. Water Law", "Asta Black", "Yuno Grinberryall", "Noelle Silva", "Luck Voltia",
			"Charmy Pappitonne", "Klaus Lunette", "Finral Roulacase", "Yami Sukehiro", "Meliodas Dragon",
			"Elizabeth Liones", "Diane Kory", "Ban Fairy", "Gowther Beast", "Merlin Mage", "Escanor Lion",
			"Nyaruko Kuko", "Konoha Sarutobi", "Shiki Granbell", "Rebecca Bluegarden", "Happy Cat", "Natsu Dragneel",
			"Edward Elric", "Alphonse Elric", "Roy Mustang", "Riza Hawkeye", "Kirito Kirigaya", "Asuna Yuuki",
			"Mob Kageyama", "Reigen Arataka", "Shinra Kusakabe", "Saitama One", "Genos Tsubasa", "Shoto Todoroki",
			"Yukino Yukinoshita", "Hachiman Hikigaya", "Yui Kotegawa", "Rika Shinozaki", "Ayano Tateyama",
			"Kyouka Jirou", "Kakashi Hatake", "Gintoki Sakata", "Inuyasha", "Bulma Briefs",
			"Sailor Moon (Usagi Tsukino)", "Shoyo Hinata", "Izuku Midoriya", "Rem", "Zero Two", "Shinichi Izumi",
			"Alucard", "Akira Fudo", "Makoto Naegi", "Android 18 (Lazuli)", "Ash Ketchum", "Legato Bluesummers",
			"Niko Robin", "Endou Mamoru");

	public static final String DEFAULT_EMAIL = "example@gmail.com";

	public static final String DEFAULT_ADDRESS = "Unknown";

	public static final Map<String, String> CHARACTER_CITY_MAP = new HashMap<>();

	public static final Map<String, String> CHARACTER_COUNTRY_MAP = new HashMap<>();

	static {

		CHARACTER_CITY_MAP.put("Son Goku", "West City");
		CHARACTER_CITY_MAP.put("Prince Vegeta", "Capsule Corp");
		CHARACTER_CITY_MAP.put("Naruto Uzumaki", "Konohagakure");
		CHARACTER_CITY_MAP.put("Sasuke Uchiha", "Konohagakure");
		CHARACTER_CITY_MAP.put("Luffy Monkey", "Foosha Village");
		CHARACTER_CITY_MAP.put("Ichigo Kurosaki", "Karakura Town");
		CHARACTER_CITY_MAP.put("Light Yagami", "Tokyo");
		CHARACTER_CITY_MAP.put("Mikasa Ackerman", "Shiganshina District");
		CHARACTER_CITY_MAP.put("Eren Yeager", "Shiganshina District");
		CHARACTER_CITY_MAP.put("Tanjiro Kamado", "Okutama");
		CHARACTER_CITY_MAP.put("Nezuko Kamado", "Okutama");
		CHARACTER_CITY_MAP.put("Zenitsu Agatsuma", "Ushigome");
		CHARACTER_CITY_MAP.put("Inosuke Hashibira", "Okutama");
		CHARACTER_CITY_MAP.put("Giyu Tomioka", "Nogata");
		CHARACTER_CITY_MAP.put("Shinobu Kocho", "Kitatoshima");
		CHARACTER_CITY_MAP.put("Kanao Tsuyuri", "Kitatoshima");
		CHARACTER_CITY_MAP.put("Satoru Gojo", "Tokyo");
		CHARACTER_CITY_MAP.put("Kento Nanami", "Tokyo");
		CHARACTER_CITY_MAP.put("Yuji Itadori", "Tokyo");
		CHARACTER_CITY_MAP.put("Manjiro Sano (Mikey)", "Tokyo");
		CHARACTER_CITY_MAP.put("Ken Ryuguji (Draken)", "Tokyo");
		CHARACTER_CITY_MAP.put("Takemichi Hanagaki", "Tokyo");
		CHARACTER_CITY_MAP.put("Hinata Tachibana", "Tokyo");
		CHARACTER_CITY_MAP.put("Rika Furude", "Hinamizawa Village");
		CHARACTER_CITY_MAP.put("Satoko Hojo", "Hinamizawa Village");
		CHARACTER_CITY_MAP.put("Akame Sougetsu", "Empire Capital");
		CHARACTER_CITY_MAP.put("Aqua Hikariko", "Axel");
		CHARACTER_CITY_MAP.put("Darkness Lalatina", "Axel");
		CHARACTER_CITY_MAP.put("Megumin Explosion", "Axel");
		CHARACTER_CITY_MAP.put("Hina Amano", "Tokyo");
		CHARACTER_CITY_MAP.put("Miku Nakano", "Tokyo");
		CHARACTER_CITY_MAP.put("Nino Nakano", "Tokyo");
		CHARACTER_CITY_MAP.put("Ichika Nakano", "Tokyo");
		CHARACTER_CITY_MAP.put("Yotsuba Nakano", "Tokyo");
		CHARACTER_CITY_MAP.put("Itsuki Nakano", "Tokyo");
		CHARACTER_CITY_MAP.put("Erza Scarlet", "Magnolia");
		CHARACTER_CITY_MAP.put("Shizuku Sangou", "Kakegurui Academy");
		CHARACTER_CITY_MAP.put("Kirari Momobami", "Kakegurui Academy");
		CHARACTER_CITY_MAP.put("Shuuichi Shindou", "Kakegurui Academy");
		CHARACTER_CITY_MAP.put("Koichi Hirose", "Morioh");
		CHARACTER_CITY_MAP.put("Kurisu Makise", "Akihabara");
		CHARACTER_CITY_MAP.put("Mayuri Shiina", "Akihabara");
		CHARACTER_CITY_MAP.put("Rintarou Okabe", "Akihabara");
		CHARACTER_CITY_MAP.put("Eru Chitanda", "Tsukikage");
		CHARACTER_CITY_MAP.put("Sora Naegino", "The Dream World");
		CHARACTER_CITY_MAP.put("Kazuma Satou", "Axel");
		CHARACTER_CITY_MAP.put("Roronoa Zoro", "East Blue");
		CHARACTER_CITY_MAP.put("Sanji Vinsmoke", "East Blue");
		CHARACTER_CITY_MAP.put("Nico Robin", "West Blue");
		CHARACTER_CITY_MAP.put("Tony Tony Chopper", "East Blue");
		CHARACTER_CITY_MAP.put("Brook Soul", "East Blue");
		CHARACTER_CITY_MAP.put("Boa Hancock", "Amazon Lily");
		CHARACTER_CITY_MAP.put("Usopp Sniper", "East Blue");
		CHARACTER_CITY_MAP.put("Shanks Red-Haired", "Grand Line");
		CHARACTER_CITY_MAP.put("Trafalgar D. Water Law", "Grand Line");
		CHARACTER_CITY_MAP.put("Asta Black", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Yuno Grinberryall", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Noelle Silva", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Luck Voltia", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Charmy Pappitonne", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Klaus Lunette", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Finral Roulacase", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Yami Sukehiro", "Clover Kingdom");
		CHARACTER_CITY_MAP.put("Meliodas Dragon", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Elizabeth Liones", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Diane Kory", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Ban Fairy", "Fairy Forest");
		CHARACTER_CITY_MAP.put("Gowther Beast", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Merlin Mage", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Escanor Lion", "Liones Kingdom");
		CHARACTER_CITY_MAP.put("Nyaruko Kuko", "A fictional city");
		CHARACTER_CITY_MAP.put("Konoha Sarutobi", "Konohagakure");
		CHARACTER_CITY_MAP.put("Shiki Granbell", "Granbell Island");
		CHARACTER_CITY_MAP.put("Rebecca Bluegarden", "Granbell Island");
		CHARACTER_CITY_MAP.put("Happy Cat", "Magnolia");
		CHARACTER_CITY_MAP.put("Natsu Dragneel", "Magnolia");
		CHARACTER_CITY_MAP.put("Edward Elric", "Central City");
		CHARACTER_CITY_MAP.put("Alphonse Elric", "Central City");
		CHARACTER_CITY_MAP.put("Roy Mustang", "Central City");
		CHARACTER_CITY_MAP.put("Riza Hawkeye", "Central City");
		CHARACTER_CITY_MAP.put("Kirito Kirigaya", "Aincrad");
		CHARACTER_CITY_MAP.put("Asuna Yuuki", "Aincrad");
		CHARACTER_CITY_MAP.put("Mob Kageyama", "Tokyo");
		CHARACTER_CITY_MAP.put("Reigen Arataka", "Tokyo");
		CHARACTER_CITY_MAP.put("Shinra Kusakabe", "Tokyo");
		CHARACTER_CITY_MAP.put("Saitama One", "City Z");
		CHARACTER_CITY_MAP.put("Genos Tsubasa", "City Z");
		CHARACTER_CITY_MAP.put("Shoto Todoroki", "Musutafu");
		CHARACTER_CITY_MAP.put("Yukino Yukinoshita", "Yukinoshita High School");
		CHARACTER_CITY_MAP.put("Hachiman Hikigaya", "Kanagawa");
		CHARACTER_CITY_MAP.put("Yui Kotegawa", "Kanagawa");
		CHARACTER_CITY_MAP.put("Rika Shinozaki", "Aincrad");
		CHARACTER_CITY_MAP.put("Ayano Tateyama", "Chiba");
		CHARACTER_CITY_MAP.put("Kyouka Jirou", "Tokyo");
		CHARACTER_CITY_MAP.put("Kakashi Hatake", "Konohagakure");
		CHARACTER_CITY_MAP.put("Gintoki Sakata", "Edo");
		CHARACTER_CITY_MAP.put("Inuyasha", "Feudal Japan");
		CHARACTER_CITY_MAP.put("Bulma Briefs", "West City");
		CHARACTER_CITY_MAP.put("Sailor Moon (Usagi Tsukino)", "Tokyo");
		CHARACTER_CITY_MAP.put("Shoyo Hinata", "Kōbe");
		CHARACTER_CITY_MAP.put("Izuku Midoriya", "Musutafu");
		CHARACTER_CITY_MAP.put("Rem", "Roswaal Mansion");
		CHARACTER_CITY_MAP.put("Zero Two", "Kiritanpo");
		CHARACTER_CITY_MAP.put("Shinichi Izumi", "Tokyo");
		CHARACTER_CITY_MAP.put("Alucard", "Hellsing");
		CHARACTER_CITY_MAP.put("Akira Fudo", "Tokyo");
		CHARACTER_CITY_MAP.put("Makoto Naegi", "Hope's Peak Academy");
		CHARACTER_CITY_MAP.put("Android 18 (Lazuli)", "West City");
		CHARACTER_CITY_MAP.put("Ash Ketchum", "Pallet Town");
//		CHARACTER_CITY_MAP.put("Legato Bluesummers", "Unknown");
		CHARACTER_CITY_MAP.put("Niko Robin", "Water 7");
		CHARACTER_CITY_MAP.put("Endou Mamoru", "Inazuma town");

	}

	static {

		CHARACTER_COUNTRY_MAP.put("Son Goku", "Japan");
		CHARACTER_COUNTRY_MAP.put("Prince Vegeta", "Japan");
		CHARACTER_COUNTRY_MAP.put("Naruto Uzumaki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Sasuke Uchiha", "Japan");
		CHARACTER_COUNTRY_MAP.put("Luffy Monkey", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ichigo Kurosaki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Light Yagami", "Japan");
		CHARACTER_COUNTRY_MAP.put("Mikasa Ackerman", "Eldia");
		CHARACTER_COUNTRY_MAP.put("Eren Yeager", "Eldia");
		CHARACTER_COUNTRY_MAP.put("Tanjiro Kamado", "Japan");
		CHARACTER_COUNTRY_MAP.put("Nezuko Kamado", "Japan");
		CHARACTER_COUNTRY_MAP.put("Zenitsu Agatsuma", "Japan");
		CHARACTER_COUNTRY_MAP.put("Inosuke Hashibira", "Japan");
		CHARACTER_COUNTRY_MAP.put("Giyu Tomioka", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shinobu Kocho", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kanao Tsuyuri", "Japan");
		CHARACTER_COUNTRY_MAP.put("Satoru Gojo", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kento Nanami", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yuji Itadori", "Japan");
		CHARACTER_COUNTRY_MAP.put("Manjiro Sano (Mikey)", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ken Ryuguji (Draken)", "Japan");
		CHARACTER_COUNTRY_MAP.put("Takemichi Hanagaki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Hinata Tachibana", "Japan");
		CHARACTER_COUNTRY_MAP.put("Rika Furude", "Japan");
		CHARACTER_COUNTRY_MAP.put("Satoko Hojo", "Japan");
		CHARACTER_COUNTRY_MAP.put("Akame Sougetsu", "Japan");
		CHARACTER_COUNTRY_MAP.put("Aqua Hikariko", "Japan");
		CHARACTER_COUNTRY_MAP.put("Darkness Lalatina", "Japan");
		CHARACTER_COUNTRY_MAP.put("Megumin Explosion", "Japan");
		CHARACTER_COUNTRY_MAP.put("Hina Amano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Miku Nakano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Nino Nakano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ichika Nakano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yotsuba Nakano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Itsuki Nakano", "Japan");
		CHARACTER_COUNTRY_MAP.put("Erza Scarlet", "Kingdom of Fiore");
		CHARACTER_COUNTRY_MAP.put("Shizuku Sangou", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kirari Momobami", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shuuichi Shindou", "Japan");
		CHARACTER_COUNTRY_MAP.put("Koichi Hirose", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kurisu Makise", "Japan");
		CHARACTER_COUNTRY_MAP.put("Mayuri Shiina", "Japan");
		CHARACTER_COUNTRY_MAP.put("Rintarou Okabe", "Japan");
		CHARACTER_COUNTRY_MAP.put("Eru Chitanda", "Japan");
		CHARACTER_COUNTRY_MAP.put("Sora Naegino", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kazuma Satou", "Japan");
		CHARACTER_COUNTRY_MAP.put("Roronoa Zoro", "Japan");
		CHARACTER_COUNTRY_MAP.put("Sanji Vinsmoke", "Japan");
		CHARACTER_COUNTRY_MAP.put("Nico Robin", "Japan");
		CHARACTER_COUNTRY_MAP.put("Tony Tony Chopper", "Japan");
		CHARACTER_COUNTRY_MAP.put("Brook Soul", "Japan");
		CHARACTER_COUNTRY_MAP.put("Boa Hancock", "Japan");
		CHARACTER_COUNTRY_MAP.put("Usopp Sniper", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shanks Red-Haired", "Japan");
		CHARACTER_COUNTRY_MAP.put("Trafalgar D. Water Law", "Japan");
		CHARACTER_COUNTRY_MAP.put("Asta Black", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yuno Grinberryall", "Japan");
		CHARACTER_COUNTRY_MAP.put("Noelle Silva", "Japan");
		CHARACTER_COUNTRY_MAP.put("Luck Voltia", "Japan");
		CHARACTER_COUNTRY_MAP.put("Charmy Pappitonne", "Japan");
		CHARACTER_COUNTRY_MAP.put("Klaus Lunette", "Japan");
		CHARACTER_COUNTRY_MAP.put("Finral Roulacase", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yami Sukehiro", "Japan");
		CHARACTER_COUNTRY_MAP.put("Meliodas Dragon", "Japan");
		CHARACTER_COUNTRY_MAP.put("Elizabeth Liones", "Japan");
		CHARACTER_COUNTRY_MAP.put("Diane Kory", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ban Fairy", "Japan");
		CHARACTER_COUNTRY_MAP.put("Gowther Beast", "Japan");
		CHARACTER_COUNTRY_MAP.put("Merlin Mage", "Japan");
		CHARACTER_COUNTRY_MAP.put("Escanor Lion", "Japan");
		CHARACTER_COUNTRY_MAP.put("Nyaruko Kuko", "Japan");
		CHARACTER_COUNTRY_MAP.put("Konoha Sarutobi", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shiki Granbell", "Japan");
		CHARACTER_COUNTRY_MAP.put("Rebecca Bluegarden", "Japan");
		CHARACTER_COUNTRY_MAP.put("Happy Cat", "Kingdom of Fiore");
		CHARACTER_COUNTRY_MAP.put("Natsu Dragneel", "Kingdom of Fiore");
		CHARACTER_COUNTRY_MAP.put("Edward Elric", "Amestris");
		CHARACTER_COUNTRY_MAP.put("Alphonse Elric", "Amestris");
		CHARACTER_COUNTRY_MAP.put("Roy Mustang", "Amestris");
		CHARACTER_COUNTRY_MAP.put("Riza Hawkeye", "Amestris");
		CHARACTER_COUNTRY_MAP.put("Kirito Kirigaya", "Japan");
		CHARACTER_COUNTRY_MAP.put("Asuna Yuuki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Mob Kageyama", "Japan");
		CHARACTER_COUNTRY_MAP.put("Reigen Arataka", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shinra Kusakabe", "Japan");
		CHARACTER_COUNTRY_MAP.put("Saitama One", "Japan");
		CHARACTER_COUNTRY_MAP.put("Genos Tsubasa", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shoto Todoroki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yukino Yukinoshita", "Japan");
		CHARACTER_COUNTRY_MAP.put("Hachiman Hikigaya", "Japan");
		CHARACTER_COUNTRY_MAP.put("Yui Kotegawa", "Japan");
		CHARACTER_COUNTRY_MAP.put("Rika Shinozaki", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ayano Tateyama", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kyouka Jirou", "Japan");
		CHARACTER_COUNTRY_MAP.put("Kakashi Hatake", "Japan");
		CHARACTER_COUNTRY_MAP.put("Gintoki Sakata", "Japan");
		CHARACTER_COUNTRY_MAP.put("Inuyasha", "Japan");
		CHARACTER_COUNTRY_MAP.put("Bulma Briefs", "Japan");
		CHARACTER_COUNTRY_MAP.put("Sailor Moon (Usagi Tsukino)", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shoyo Hinata", "Japan");
		CHARACTER_COUNTRY_MAP.put("Izuku Midoriya", "Japan");
		CHARACTER_COUNTRY_MAP.put("Rem", "Lugnica");
		CHARACTER_COUNTRY_MAP.put("Zero Two", "Japan");
		CHARACTER_COUNTRY_MAP.put("Shinichi Izumi", "Japan");
		CHARACTER_COUNTRY_MAP.put("Alucard", "England");
		CHARACTER_COUNTRY_MAP.put("Akira Fudo", "Japan");
		CHARACTER_COUNTRY_MAP.put("Makoto Naegi", "Japan");
		CHARACTER_COUNTRY_MAP.put("Android 18 (Lazuli)", "Japan");
		CHARACTER_COUNTRY_MAP.put("Ash Ketchum", "Pokémon World");
//		CHARACTER_COUNTRY_MAP.put("Legato Bluesummers", "Unknown");
		CHARACTER_COUNTRY_MAP.put("Niko Robin", "Japan");
		CHARACTER_COUNTRY_MAP.put("Endou Mamoru", "Japan");

	}

}
