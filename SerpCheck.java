driver.get("Paste yout file path here");	
String stored = driver.getPageSource();		
String[] incode = { "tag:ccpa_cmp_code", "transitional.dtd", "tag:mnet_policy_link",
"tag:ad_annotation_enabled", "tag:rank_annotation_enabled", "<tag:post_form_html>", "tag:display_query",
"<tag:reset_css>", "tag:jssource", "about:blank" };
System.out.println("");	
System.out.println("Tags and script in code");
System.out.println("------------------------");	
for (String check : incode) {
	boolean Present = stored.contains(check);

	if (Present == true) {
		System.out.println(check + " --- Tag is present in the code");
	} else
	System.out.println(check + " ---***ERORR***----Tag is not present in the code");                                                      
}
System.out.println("");	
System.out.println("COUNT of Tags");	
System.out.println("------------------------");	

int count = 0;

for (String word : stored.split(" "))
{

	if (word.contains("if:ad_present")) {
		count++;
	}

}
System.out.println("<if:ad_present> & </if:ad_present>: " + count);

int count1 = 0;
for (String word : stored.split(" "))
{
	if (word.contains("tag:ad_annotation_enabled")) {
		count1++;
	}

}
System.out.println("annot<tag:ad_annotation_enabled />: " + count1);

int count2 = 0;
for (String word : stored.split(" "))
{

	if (word.contains("tag:rank_annotation_enabled")) {
		count2++;
	}

}
System.out.println("rank<tag:rank_annotation_enabled />: " + count2);

int count3 = 0;

for (String word : stored.split(" "))
{

	if (word.contains("ad_title_text:")) {
		count3++;
	}

}
System.out.println("<ad_title_text: /> : " + count3);

int count4 = 0;
for (String word : stored.split(" "))
{

	if (word.contains("ad_url_text:")) {
		count4++;
	}

}
System.out.println("<ad_url_text: /> : " + count4);

int count5 = 0;
for (String word : stored.split(" "))
{

	if (word.contains("ad_desc:")) {
		count5++;
	}

}
System.out.println("<ad_desc: /> : " + count5);

int count6 = 0;
for (String word : stored.split(" "))
{

	if (word.contains("ad_href_url:")) {
		count6++;
	}

}
System.out.println("<ad_href_url: /> : " + count6);

System.out.println("");
if (count1 == (count2)) {

	System.out.println("The value of ad_ANNOT Is EQUAL to rank_ANNOT");
}
else {
	System.out.println("ERORRR--------Values of the ANNOT does not match.");
}

if((count4 == (count5)) == (count5 == (count6))){

	System.out.println("The values of Title,URL & DESC  are same");
}
else {
	System.out.println("ERORRR--------Values of the adblocks does not match.");

}
System.out.println("");
boolean FontCount = false;
int totalFontused=0;
for (String word : stored.split("font-family: <tagd:style name=\"Keywords\""))
{        

	if (word.contains("type=\"font-family\"")) 
	{
		totalFontused++; 

	} 

}
if(totalFontused>3)
{
	System.out.println("Source code has more than 3 fonts");

}
System.out.println("Total fonts used is:" +totalFontused);




