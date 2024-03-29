package com.cucumber.framework.configuration.browser;

import com.cucumber.framework.utility.DateTimeHelper;
import com.cucumber.framework.utility.ResourceHelper;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author manoj.jena
 *
 *         11-Nov-2023
 *
 */
public class PhantomJsBrowser {
	public PhantomJSDriverService getPhantomJsService() {
		return new PhantomJSDriverService.Builder()
				.usingAnyFreePort()
				.usingPhantomJSExecutable(
						new File(ResourceHelper
								.getResourcePath("driver/phantomjs.exe")))
				.withLogFile(
						new File(ResourceHelper
								.getResourcePath("logs/phantomjslogs/")
								+ "phantomjslogs"
								+ DateTimeHelper.getCurrentDateTime() + ".log"))
				.build();

	}

	public Capabilities getPhantomJsCapability() {
		DesiredCapabilities cap = DesiredCapabilities.phantomjs();
		cap.setJavascriptEnabled(true);
		return cap;
	}

	public WebDriver getPhantomJsDriver(PhantomJSDriverService sev,
			Capabilities cap) {

		return new PhantomJSDriver(sev, cap);
	}
	
	public WebDriver getPhantomJsDriver(String hubUrl,PhantomJSDriverService sev,
			Capabilities cap) throws MalformedURLException {

		return new RemoteWebDriver(new URL(hubUrl), cap);
	}
	
}
