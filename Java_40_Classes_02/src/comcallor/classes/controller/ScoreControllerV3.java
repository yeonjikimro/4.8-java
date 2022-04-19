package comcallor.classes.controller;

import comcallor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);

		// String[] strNames = new String[5];
		// strNames[0] = "»´±Êµø";
		// strNames[1] = "¿Ã∏˘∑Ê";
		// strNames[2] = "º∫√·«‚";
		// strNames[3] = "¿”≤©¡§";
		// strNames[4] = "¿Â∫∏∞Ì";
		String[] strNames = { "»´±Êµø", "¿Ã∏˘∑Ê", "º∫√·«‚", "¿”≤©¡§", "¿Â∫∏∞Ì" };
		
		scServiceV3 = new ScoreServiceV3(strNames);
		
	}
}
