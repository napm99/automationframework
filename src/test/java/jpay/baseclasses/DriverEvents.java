package jpay.baseclasses;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import jpay.utilities.Constants;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class DriverEvents{

	public static WebDriver driver;
	public static DriverEvents events;
	public static WebDriverWait wait;
	public static String emailGenerated;
	public static String phoneNumberGenerated;
	public String wwwPassword = "userpassword";
	public static String ssnNumberGenerated;
	public static String webElementValue;
	public static Logger logger;

	/**
	 * This method should be use to open the required browser at any time during
	 * the test or at start of a new test.
	 *
	 */
	public DriverEvents openBrowser(String browser) {

		logger = Logger.getLogger("AutomationFramework_JPay");
		PropertyConfigurator.configure("log4j.properties");

		try {

			if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Google")) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
				driver = new ChromeDriver(options);

			} else if (browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("FF")) {

				FirefoxOptions options = new FirefoxOptions();
				options.addPreference("browser.download.folderList", 2);
				options.addPreference("browser.download.useDownloadDir", true);
				options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.hzn-3d-crossword;video/3gpp;video/3gpp2;application/vnd.mseq;application/vnd.3m.post-it-notes;application/vnd.3gpp.pic-bw-large;application/vnd.3gpp.pic-bw-small;application/vnd.3gpp.pic-bw-var;application/vnd.3gp2.tcap;application/x-7z-compressed;application/x-abiword;application/x-ace-compressed;application/vnd.americandynamics.acc;application/vnd.acucobol;application/vnd.acucorp;audio/adpcm;application/x-authorware-bin;application/x-athorware-map;application/x-authorware-seg;application/vnd.adobe.air-application-installer-package+zip;application/x-shockwave-flash;application/vnd.adobe.fxp;application/pdf;application/vnd.cups-ppd;application/x-director;applicaion/vnd.adobe.xdp+xml;application/vnd.adobe.xfdf;audio/x-aac;application/vnd.ahead.space;application/vnd.airzip.filesecure.azf;application/vnd.airzip.filesecure.azs;application/vnd.amazon.ebook;application/vnd.amiga.ami;applicatin/andrew-inset;application/vnd.android.package-archive;application/vnd.anser-web-certificate-issue-initiation;application/vnd.anser-web-funds-transfer-initiation;application/vnd.antix.game-component;application/vnd.apple.installe+xml;application/applixware;application/vnd.hhe.lesson-player;application/vnd.aristanetworks.swi;text/x-asm;application/atomcat+xml;application/atomsvc+xml;application/atom+xml;application/pkix-attr-cert;audio/x-aiff;video/x-msvieo;application/vnd.audiograph;image/vnd.dxf;model/vnd.dwf;text/plain-bas;application/x-bcpio;application/octet-stream;image/bmp;application/x-bittorrent;application/vnd.rim.cod;application/vnd.blueice.multipass;application/vnd.bm;application/x-sh;image/prs.btif;application/vnd.businessobjects;application/x-bzip;application/x-bzip2;application/x-csh;text/x-c;application/vnd.chemdraw+xml;text/css;chemical/x-cdx;chemical/x-cml;chemical/x-csml;application/vn.contact.cmsg;application/vnd.claymore;application/vnd.clonk.c4group;image/vnd.dvb.subtitle;application/cdmi-capability;application/cdmi-container;application/cdmi-domain;application/cdmi-object;application/cdmi-queue;applicationvnd.cluetrust.cartomobile-config;application/vnd.cluetrust.cartomobile-config-pkg;image/x-cmu-raster;model/vnd.collada+xml;text/csv;application/mac-compactpro;application/vnd.wap.wmlc;image/cgm;x-conference/x-cooltalk;image/x-cmx;application/vnd.xara;application/vnd.cosmocaller;application/x-cpio;application/vnd.crick.clicker;application/vnd.crick.clicker.keyboard;application/vnd.crick.clicker.palette;application/vnd.crick.clicker.template;application/vn.crick.clicker.wordbank;application/vnd.criticaltools.wbs+xml;application/vnd.rig.cryptonote;chemical/x-cif;chemical/x-cmdf;application/cu-seeme;application/prs.cww;text/vnd.curl;text/vnd.curl.dcurl;text/vnd.curl.mcurl;text/vnd.crl.scurl;application/vnd.curl.car;application/vnd.curl.pcurl;application/vnd.yellowriver-custom-menu;application/dssc+der;application/dssc+xml;application/x-debian-package;audio/vnd.dece.audio;image/vnd.dece.graphic;video/vnd.dec.hd;video/vnd.dece.mobile;video/vnd.uvvu.mp4;video/vnd.dece.pd;video/vnd.dece.sd;video/vnd.dece.video;application/x-dvi;application/vnd.fdsn.seed;application/x-dtbook+xml;application/x-dtbresource+xml;application/vnd.dvb.ait;applcation/vnd.dvb.service;audio/vnd.digital-winds;image/vnd.djvu;application/xml-dtd;application/vnd.dolby.mlp;application/x-doom;application/vnd.dpgraph;audio/vnd.dra;application/vnd.dreamfactory;audio/vnd.dts;audio/vnd.dts.hd;imag/vnd.dwg;application/vnd.dynageo;application/ecmascript;application/vnd.ecowin.chart;image/vnd.fujixerox.edmics-mmr;image/vnd.fujixerox.edmics-rlc;application/exi;application/vnd.proteus.magazine;application/epub+zip;message/rfc82;application/vnd.enliven;application/vnd.is-xpr;image/vnd.xiff;application/vnd.xfdl;application/emma+xml;application/vnd.ezpix-album;application/vnd.ezpix-package;image/vnd.fst;video/vnd.fvt;image/vnd.fastbidsheet;application/vn.denovo.fcselayout-link;video/x-f4v;video/x-flv;image/vnd.fpx;image/vnd.net-fpx;text/vnd.fmi.flexstor;video/x-fli;application/vnd.fluxtime.clip;application/vnd.fdf;text/x-fortran;application/vnd.mif;application/vnd.framemaker;imae/x-freehand;application/vnd.fsc.weblaunch;application/vnd.frogans.fnc;application/vnd.frogans.ltf;application/vnd.fujixerox.ddd;application/vnd.fujixerox.docuworks;application/vnd.fujixerox.docuworks.binder;application/vnd.fujitu.oasys;application/vnd.fujitsu.oasys2;application/vnd.fujitsu.oasys3;application/vnd.fujitsu.oasysgp;application/vnd.fujitsu.oasysprs;application/x-futuresplash;application/vnd.fuzzysheet;image/g3fax;application/vnd.gmx;model/vn.gtw;application/vnd.genomatix.tuxedo;application/vnd.geogebra.file;application/vnd.geogebra.tool;model/vnd.gdl;application/vnd.geometry-explorer;application/vnd.geonext;application/vnd.geoplan;application/vnd.geospace;applicatio/x-font-ghostscript;application/x-font-bdf;application/x-gtar;application/x-texinfo;application/x-gnumeric;application/vnd.google-earth.kml+xml;application/vnd.google-earth.kmz;application/vnd.grafeq;image/gif;text/vnd.graphviz;aplication/vnd.groove-account;application/vnd.groove-help;application/vnd.groove-identity-message;application/vnd.groove-injector;application/vnd.groove-tool-message;application/vnd.groove-tool-template;application/vnd.groove-vcar;video/h261;video/h263;video/h264;application/vnd.hp-hpid;application/vnd.hp-hps;application/x-hdf;audio/vnd.rip;application/vnd.hbci;application/vnd.hp-jlyt;application/vnd.hp-pcl;application/vnd.hp-hpgl;application/vnd.yamaha.h-script;application/vnd.yamaha.hv-dic;application/vnd.yamaha.hv-voice;application/vnd.hydrostatix.sof-data;application/hyperstudio;application/vnd.hal+xml;text/html;application/vnd.ibm.rights-management;application/vnd.ibm.securecontainer;text/calendar;application/vnd.iccprofile;image/x-icon;application/vnd.igloader;image/ief;application/vnd.immervision-ivp;application/vnd.immervision-ivu;application/reginfo+xml;text/vnd.in3d.3dml;text/vnd.in3d.spot;mode/iges;application/vnd.intergeo;application/vnd.cinderella;application/vnd.intercon.formnet;application/vnd.isac.fcs;application/ipfix;application/pkix-cert;application/pkixcmp;application/pkix-crl;application/pkix-pkipath;applicaion/vnd.insors.igm;application/vnd.ipunplugged.rcprofile;application/vnd.irepository.package+xml;text/vnd.sun.j2me.app-descriptor;application/java-archive;application/java-vm;application/x-java-jnlp-file;application/java-serializd-object;text/x-java-source,java;application/javascript;application/json;application/vnd.joost.joda-archive;video/jpm;image/jpeg;video/jpeg;application/vnd.kahootz;application/vnd.chipnuts.karaoke-mmd;application/vnd.kde.karbon;aplication/vnd.kde.kchart;application/vnd.kde.kformula;application/vnd.kde.kivio;application/vnd.kde.kontour;application/vnd.kde.kpresenter;application/vnd.kde.kspread;application/vnd.kde.kword;application/vnd.kenameaapp;applicatin/vnd.kidspiration;application/vnd.kinar;application/vnd.kodak-descriptor;application/vnd.las.las+xml;application/x-latex;application/vnd.llamagraphics.life-balance.desktop;application/vnd.llamagraphics.life-balance.exchange+xml;application/vnd.jam;application/vnd.lotus-1-2-3;application/vnd.lotus-approach;application/vnd.lotus-freelance;application/vnd.lotus-notes;application/vnd.lotus-organizer;application/vnd.lotus-screencam;application/vnd.lotus-wordro;audio/vnd.lucent.voice;audio/x-mpegurl;video/x-m4v;application/mac-binhex40;application/vnd.macports.portpkg;application/vnd.osgeo.mapguide.package;application/marc;application/marcxml+xml;application/mxf;application/vnd.wolfrm.player;application/mathematica;application/mathml+xml;application/mbox;application/vnd.medcalcdata;application/mediaservercontrol+xml;application/vnd.mediastation.cdkey;application/vnd.mfer;application/vnd.mfmp;model/mesh;appliation/mads+xml;application/mets+xml;application/mods+xml;application/metalink4+xml;application/vnd.ms-powerpoint.template.macroenabled.12;application/vnd.ms-word.document.macroenabled.12;application/vnd.ms-word.template.macroenabed.12;application/vnd.mcd;application/vnd.micrografx.flo;application/vnd.micrografx.igx;application/vnd.eszigno3+xml;application/x-msaccess;video/x-ms-asf;application/x-msdownload;application/vnd.ms-artgalry;application/vnd.ms-ca-compressed;application/vnd.ms-ims;application/x-ms-application;application/x-msclip;image/vnd.ms-modi;application/vnd.ms-fontobject;application/vnd.ms-excel;application/vnd.ms-excel.addin.macroenabled.12;application/vnd.ms-excelsheet.binary.macroenabled.12;application/vnd.ms-excel.template.macroenabled.12;application/vnd.ms-excel.sheet.macroenabled.12;application/vnd.ms-htmlhelp;application/x-mscardfile;application/vnd.ms-lrm;application/x-msmediaview;aplication/x-msmoney;application/vnd.openxmlformats-officedocument.presentationml.presentation;application/vnd.openxmlformats-officedocument.presentationml.slide;application/vnd.openxmlformats-officedocument.presentationml.slideshw;application/vnd.openxmlformats-officedocument.presentationml.template;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;application/vnd.openxmlformats-officedocument.spreadsheetml.template;application/vnd.openxmformats-officedocument.wordprocessingml.document;application/vnd.openxmlformats-officedocument.wordprocessingml.template;application/x-msbinder;application/vnd.ms-officetheme;application/onenote;audio/vnd.ms-playready.media.pya;vdeo/vnd.ms-playready.media.pyv;application/vnd.ms-powerpoint;application/vnd.ms-powerpoint.addin.macroenabled.12;application/vnd.ms-powerpoint.slide.macroenabled.12;application/vnd.ms-powerpoint.presentation.macroenabled.12;appliation/vnd.ms-powerpoint.slideshow.macroenabled.12;application/vnd.ms-project;application/x-mspublisher;application/x-msschedule;application/x-silverlight-app;application/vnd.ms-pki.stl;application/vnd.ms-pki.seccat;application/vn.visio;video/x-ms-wm;audio/x-ms-wma;audio/x-ms-wax;video/x-ms-wmx;application/x-ms-wmd;application/vnd.ms-wpl;application/x-ms-wmz;video/x-ms-wmv;video/x-ms-wvx;application/x-msmetafile;application/x-msterminal;application/msword;application/x-mswrite;application/vnd.ms-works;application/x-ms-xbap;application/vnd.ms-xpsdocument;audio/midi;application/vnd.ibm.minipay;application/vnd.ibm.modcap;application/vnd.jcp.javame.midlet-rms;application/vnd.tmobile-ivetv;application/x-mobipocket-ebook;application/vnd.mobius.mbk;application/vnd.mobius.dis;application/vnd.mobius.plc;application/vnd.mobius.mqy;application/vnd.mobius.msl;application/vnd.mobius.txf;application/vnd.mobius.daf;tex/vnd.fly;application/vnd.mophun.certificate;application/vnd.mophun.application;video/mj2;audio/mpeg;video/vnd.mpegurl;video/mpeg;application/mp21;audio/mp4;video/mp4;application/mp4;application/vnd.apple.mpegurl;application/vnd.msician;application/vnd.muvee.style;application/xv+xml;application/vnd.nokia.n-gage.data;application/vnd.nokia.n-gage.symbian.install;application/x-dtbncx+xml;application/x-netcdf;application/vnd.neurolanguage.nlu;application/vnd.na;application/vnd.noblenet-directory;application/vnd.noblenet-sealer;application/vnd.noblenet-web;application/vnd.nokia.radio-preset;application/vnd.nokia.radio-presets;text/n3;application/vnd.novadigm.edm;application/vnd.novadim.edx;application/vnd.novadigm.ext;application/vnd.flographit;audio/vnd.nuera.ecelp4800;audio/vnd.nuera.ecelp7470;audio/vnd.nuera.ecelp9600;application/oda;application/ogg;audio/ogg;video/ogg;application/vnd.oma.dd2+xml;applicatin/vnd.oasis.opendocument.text-web;application/oebps-package+xml;application/vnd.intu.qbo;application/vnd.openofficeorg.extension;application/vnd.yamaha.openscoreformat;audio/webm;video/webm;application/vnd.oasis.opendocument.char;application/vnd.oasis.opendocument.chart-template;application/vnd.oasis.opendocument.database;application/vnd.oasis.opendocument.formula;application/vnd.oasis.opendocument.formula-template;application/vnd.oasis.opendocument.grapics;application/vnd.oasis.opendocument.graphics-template;application/vnd.oasis.opendocument.image;application/vnd.oasis.opendocument.image-template;application/vnd.oasis.opendocument.presentation;application/vnd.oasis.opendocumen.presentation-template;application/vnd.oasis.opendocument.spreadsheet;application/vnd.oasis.opendocument.spreadsheet-template;application/vnd.oasis.opendocument.text;application/vnd.oasis.opendocument.text-master;application/vnd.asis.opendocument.text-template;image/ktx;application/vnd.sun.xml.calc;application/vnd.sun.xml.calc.template;application/vnd.sun.xml.draw;application/vnd.sun.xml.draw.template;application/vnd.sun.xml.impress;application/vnd.sun.xl.impress.template;application/vnd.sun.xml.math;application/vnd.sun.xml.writer;application/vnd.sun.xml.writer.global;application/vnd.sun.xml.writer.template;application/x-font-otf;application/vnd.yamaha.openscoreformat.osfpvg+xml;application/vnd.osgi.dp;application/vnd.palm;text/x-pascal;application/vnd.pawaafile;application/vnd.hp-pclxl;application/vnd.picsel;image/x-pcx;image/vnd.adobe.photoshop;application/pics-rules;image/x-pict;application/x-chat;aplication/pkcs10;application/x-pkcs12;application/pkcs7-mime;application/pkcs7-signature;application/x-pkcs7-certreqresp;application/x-pkcs7-certificates;application/pkcs8;application/vnd.pocketlearn;image/x-portable-anymap;image/-portable-bitmap;application/x-font-pcf;application/font-tdpfr;application/x-chess-pgn;image/x-portable-graymap;image/png;image/x-portable-pixmap;application/pskc+xml;application/vnd.ctc-posml;application/postscript;application/xfont-type1;application/vnd.powerbuilder6;application/pgp-encrypted;application/pgp-signature;application/vnd.previewsystems.box;application/vnd.pvi.ptid1;application/pls+xml;application/vnd.pg.format;application/vnd.pg.osasli;tex/prs.lines.tag;application/x-font-linux-psf;application/vnd.publishare-delta-tree;application/vnd.pmi.widget;application/vnd.quark.quarkxpress;application/vnd.epson.esf;application/vnd.epson.msf;application/vnd.epson.ssf;applicaton/vnd.epson.quickanime;application/vnd.intu.qfx;video/quicktime;application/x-rar-compressed;audio/x-pn-realaudio;audio/x-pn-realaudio-plugin;application/rsd+xml;application/vnd.rn-realmedia;application/vnd.realvnc.bed;applicatin/vnd.recordare.musicxml;application/vnd.recordare.musicxml+xml;application/relax-ng-compact-syntax;application/vnd.data-vision.rdz;application/rdf+xml;application/vnd.cloanto.rp9;application/vnd.jisp;application/rtf;text/richtex;application/vnd.route66.link66+xml;application/rss+xml;application/shf+xml;application/vnd.sailingtracker.track;image/svg+xml;application/vnd.sus-calendar;application/sru+xml;application/set-payment-initiation;application/set-reistration-initiation;application/vnd.sema;application/vnd.semd;application/vnd.semf;application/vnd.seemail;application/x-font-snf;application/scvp-vp-request;application/scvp-vp-response;application/scvp-cv-request;application/svp-cv-response;application/sdp;text/x-setext;video/x-sgi-movie;application/vnd.shana.informed.formdata;application/vnd.shana.informed.formtemplate;application/vnd.shana.informed.interchange;application/vnd.shana.informed.package;application/thraud+xml;application/x-shar;image/x-rgb;application/vnd.epson.salt;application/vnd.accpac.simply.aso;application/vnd.accpac.simply.imp;application/vnd.simtech-mindmapper;application/vnd.commonspace;application/vnd.ymaha.smaf-audio;application/vnd.smaf;application/vnd.yamaha.smaf-phrase;application/vnd.smart.teacher;application/vnd.svd;application/sparql-query;application/sparql-results+xml;application/srgs;application/srgs+xml;application/sml+xml;application/vnd.koan;text/sgml;application/vnd.stardivision.calc;application/vnd.stardivision.draw;application/vnd.stardivision.impress;application/vnd.stardivision.math;application/vnd.stardivision.writer;application/vnd.tardivision.writer-global;application/vnd.stepmania.stepchart;application/x-stuffit;application/x-stuffitx;application/vnd.solent.sdkm+xml;application/vnd.olpc-sugar;audio/basic;application/vnd.wqd;application/vnd.symbian.install;application/smil+xml;application/vnd.syncml+xml;application/vnd.syncml.dm+wbxml;application/vnd.syncml.dm+xml;application/x-sv4cpio;application/x-sv4crc;application/sbml+xml;text/tab-separated-values;image/tiff;application/vnd.to.intent-module-archive;application/x-tar;application/x-tcl;application/x-tex;application/x-tex-tfm;application/tei+xml;text/plain;application/vnd.spotfire.dxp;application/vnd.spotfire.sfs;application/timestamped-data;applicationvnd.trid.tpt;application/vnd.triscape.mxs;text/troff;application/vnd.trueapp;application/x-font-ttf;text/turtle;application/vnd.umajin;application/vnd.uoml+xml;application/vnd.unity;application/vnd.ufdl;text/uri-list;application/nd.uiq.theme;application/x-ustar;text/x-uuencode;text/x-vcalendar;text/x-vcard;application/x-cdlink;application/vnd.vsf;model/vrml;application/vnd.vcx;model/vnd.mts;model/vnd.vtu;application/vnd.visionary;video/vnd.vivo;applicatin/ccxml+xml,;application/voicexml+xml;application/x-wais-source;application/vnd.wap.wbxml;image/vnd.wap.wbmp;audio/x-wav;application/davmount+xml;application/x-font-woff;application/wspolicy+xml;image/webp;application/vnd.webturb;application/widget;application/winhlp;text/vnd.wap.wml;text/vnd.wap.wmlscript;application/vnd.wap.wmlscriptc;application/vnd.wordperfect;application/vnd.wt.stf;application/wsdl+xml;image/x-xbitmap;image/x-xpixmap;image/x-xwindowump;application/x-x509-ca-cert;application/x-xfig;application/xhtml+xml;application/xml;application/xcap-diff+xml;application/xenc+xml;application/patch-ops-error+xml;application/resource-lists+xml;application/rls-services+xml;aplication/resource-lists-diff+xml;application/xslt+xml;application/xop+xml;application/x-xpinstall;application/xspf+xml;application/vnd.mozilla.xul+xml;chemical/x-xyz;text/yaml;application/yang;application/yin+xml;application/vnd.ul;application/zip;application/vnd.handheld-entertainment+xml;application/vnd.zzazz.deck+xml");
				options.addPreference("pdfjs.disabled", true);
				options.addArguments("--start-maximized");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();

			} else if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("Internet Explorer")) {

				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("EnableNativeEvents", false);
				caps.setCapability("IgnoreZoomSetting", true);
				caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				caps.setCapability(InternetExplorerDriver.SILENT, true);
				caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.google.com/");
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "//Drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver(caps);
				driver.manage().window().maximize();

			} else if (browser.equalsIgnoreCase("Opera") || browser.equalsIgnoreCase("OP")) {

				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();

			} else if (browser.equalsIgnoreCase("MsEdge") || browser.equalsIgnoreCase("Edge")) {

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			} else if (browser.equalsIgnoreCase("Headless") || browser.equalsIgnoreCase("Hidden")) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
				driver = new ChromeDriver(options);

			} else if (browser.equalsIgnoreCase("Android") || browser.equalsIgnoreCase("android")) {

				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nilbert_Pixel3_Oreo8.1v");
				caps.setCapability(MobileCapabilityType.APP,"");
				

			} else {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				// WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
				driver = new ChromeDriver(options);

			}

			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		} catch (Exception e) {
			logger.info("An Instance of the browser has failed to open");
		}

		return events;
	}
	
	/*@BeforeClass
	public synchronized void videoRecorder(Method method) throws MalformedURLException {
		logger.info("Starting execution of a test case: "  + method.getName());
		DateFormat dateFormat = new SimpleDateFormat()
		
	}*/

	/**
	 * The method quitDriver is use to quit the instance of the driver that is
	 * currently in use during the test
	 *
	 */
	@AfterClass(alwaysRun = true)
	public DriverEvents quitBrowser() {
		driver.quit();
		return events;
	}

	/**
	 * This method handles the navigation to a page this allows the user to go
	 * to a page during the test after the driver has been initialized.
	 *
	 */
	public DriverEvents goTo(String url) {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Constants.WAIT_FOR_ELEMENT, TimeUnit.SECONDS);
		return events;
	}

	/**
	 * The method click handles the method from the selenium library click()
	 * this allows the user to click on a web element
	 *
	 */
	public DriverEvents click(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).click();
		return events;
	}

	/**
	 * The method click handles the method from the selenium library click()
	 * this allows the user to click on a web element
	 *
	 */
	public DriverEvents jsclick(By element)  {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		WebElement jselement = driver.findElement(element);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", jselement);
		try {
			hardWait();
		} catch (Exception e){
			e.printStackTrace();
		}
		return events;
	}

	/**
	 * The method click handles the method from the selenium library click()
	 * this allows the user to click on a web element
	 *
	 */
	public DriverEvents doubleClick(By element) {
		Actions actions = new Actions(driver);
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.doubleClick(driver.findElement(element));
		return events;
	}

	/**
	 * The method setText handles the method sendkeys() from selenium library
	 * this allows the user to type into a text box
	 */
	public DriverEvents setText(By element, String text) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(text);
		return events;
	}

	/**
	 * The method captureScreen is going to manage taking a picture
	 * 
	 *
	 */
	public void captureScreen(WebDriver driver, String testName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + testName + ".png");
		FileUtils.copyFile(source, target);
		logger.info("-- Screenshot taken - Test failed ! --");
	}

	/**
	 * The method verifyTitle will be use to verify the Title of the page from
	 * the html head element e.g. <title>JPay-Title Example</title>
	 */
	public DriverEvents verifyTitle(String pageTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		Boolean titleElement = wait.until(ExpectedConditions.titleContains(pageTitle));
		if (titleElement) {
			Assert.assertTrue(true);
			logger.info("-- The expected value has been found to be part of Title --");
		} else {
			Assert.assertTrue(false);
			logger.info("-- The expected value has NOT been found to be part of the URL --");
		}
		return events;
	}

	/**
	 * The method setRandomEmail will be use to generate and enter a random
	 * email in the locator passed, the user needs to pass an xpath locator.
	 *
	 */
	public DriverEvents setRandomEmail(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		String emailGenerator = RandomStringUtils.randomAlphabetic(9).toLowerCase();
		driver.findElement(element).sendKeys("qatest" + emailGenerator+ "@gmail.com");
		logger.info("-- The random email have been generated successfully -- " + " Email Generated: " +"qatest"+emailGenerator+"@gmail.com");
		emailGenerated = "qatest"+emailGenerator+"@gmail.com";
		return events;
	}

	/**
	 * The method setPassword will be used to generate a common password
	 * for all users that are created using an automated script
	 *
	 */
	public DriverEvents setPassword(By element){
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(wwwPassword);
		return events;
	}


	/**
	 * The method setPhoneNumber will be use to generate and enter a random
	 * phone number format XXX-XXX-XXXX in the locator passed, the user needs to
	 * pass an xpath locator.
	 *
	 */
	public DriverEvents setPhoneNumber(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		String phoneGenerator = RandomStringUtils.randomNumeric(3);
		String lastFourNumbers = RandomStringUtils.randomNumeric(4);
		String phoneNumber = phoneGenerator +"-"+ phoneGenerator +"-"+ lastFourNumbers;
		driver.findElement(element).sendKeys(phoneNumber);
		logger.info("-- The phone number fixed format xxx-xxx-xxxx have been generated successfully --" + " " + "Phone Number Generated: " + phoneNumber);

		return events;
	}

	/**
	 * The method setRandomNumber will be use to generate and enter a random
	 * number format XXXXXXXXX (9 numbers) in the locator passed, the user needs
	 * to pass an xpath locator.
	 *
	 */
	public DriverEvents setTenRandomNumbers(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		String numberGenerator = RandomStringUtils.randomNumeric(10);
		driver.findElement(element).sendKeys(numberGenerator);
		logger.info("-- The 10 digit number have been generated successfully --");
		return events;
	}

	/**
	 * The method setRandomNumber will be use to generate and enter a random
	 * number format XXXXXXXXX (9 numbers) in the locator passed, the user needs
	 * to pass an xpath locator.
	 *
	 */
	public DriverEvents setFakeSSN(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		String numberGenerator = RandomStringUtils.randomNumeric(9);
		driver.findElement(element).sendKeys(numberGenerator);
		logger.info("-- The 9 digit ssn fake number have been generated successfully --");
		return events;
	}

	/**
	 * The method setRandomNumber will be use to generate and enter a random
	 * number format XXXXXXXXX (9 numbers) in the locator passed, the user needs
	 * to pass an xpath locator.
	 *
	 */
	public DriverEvents setRandomPin(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		String numberGenerator = RandomStringUtils.randomNumeric(4);
		driver.findElement(element).sendKeys(numberGenerator);
		logger.info("-- The 4 digit number have been generated successfully --" + " " + "Pin generated: "+ numberGenerator);
		return events;
	}

	/**
	 * The method verifyURL is use to check that the content located in the URL
	 * matches what the user is expecting if false the test will fail
	 *
	 */
	public DriverEvents verifyURL(String url) {
		WebDriverWait wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		Boolean urlElement = wait.until(ExpectedConditions.urlContains(url));
		if (urlElement) {
			Assert.assertTrue(true);
			logger.info("-- The expected value has been found to be part of the URL --");
		} else {
			Assert.assertTrue(false);
			logger.info("-- The expected value has NOT been found to be part of the URL --");
		}
		return events;
	}

	/**
	 * The method verifyElementPresent is use to confirm that an element is
	 * expecte to be in the page during the test
	 *
	 */
	public DriverEvents verifyElementPresent(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if (driver.findElement(element).isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("-- Element have been found in the DOM --");
		} else {
			Assert.assertTrue(false);
			logger.info("-- Element NOT found in the DOM --");
		}
		return events;
	}
	
	
	
	/*
	 * THESE METHODS ARE GOING TO HANDLE THE WINDOWS THAT ARE OPENED
	 * DURING THE RUN OF THE TESTS
	 *************************************************/

	/**
	 * The method switchWindow is use to change from the current window to a new
	 * window that is opened during the test.
	 *
	 */
	public DriverEvents switchWindow() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			logger.info("-- SwitchWindow event have been handle sucessfully --");
		}
		return events;
	}

	/**
	 * The method switchToOriginalWindow is use to change from a new window(s)
	 * to the original window opened at the beginning of the test.
	 *
	 */
	public DriverEvents switchToOriginalWindow() {
		driver.close();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		return events;
	}

	//*************************************************************************************
	/**
	 * The method compareElementsText is use to compare that the value from an
	 * element matches the value of another element in the page.
	 *
	 */
	public DriverEvents compareElementsText(By element1, By element2) {
		String firstElement = driver.findElement(element1).getText();
		String secondElement = driver.findElement(element2).getText();
		if (secondElement.contains(firstElement)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		return events;
	}

	/**
	 * The method verifyElementContains is to validate that an element's value
	 * matches the value being passed by the user.
	 *
	 */
	public DriverEvents verifyElementContains(By element, String value) {
		String firstElement = driver.findElement(element).getText();
		if (firstElement.contains(value)) {
			Assert.assertTrue(true);
			logger.info("-- Element Contains the expected value --");
		} else {
			Assert.assertTrue(false);
			logger.info("-- Element Does NOT contain the expected value --");
		}
		return events;
	}

	/*
	 * START OF NAVIGATING EVENTS FROM WEBDRIVER LIBRARY START OF NAVIGATING
	 * EVENTS FROM WEBDRIVER LIBRARY START OF NAVIGATING EVENTS FROM WEBDRIVER
	 * LIBRARY
	 *************************************************/

	/**
	 * The method goBack() is use for navigation purposes this will go back 1
	 * page, mimics the back button from the browser.
	 */
	public DriverEvents goBack() {
		driver.navigate().back();
		return events;
	}

	/**
	 * The method goForward() is use for navigation purposes this will go
	 * forward 1 page, mimics the forward button from the browser.
	 *
	 */
	public DriverEvents goForward() {
		driver.navigate().forward();
		return events;
	}

	/**
	 * The method refresPage() is use for navigation purposes this will perform
	 * the same function as pressing F5 in the browser.
	 *
	 */
	public DriverEvents refreshPage() {
		driver.navigate().refresh();
		return events;
	}

	/*
	 * START OF KEYBOARD EVENTS FROM WEBDRIVER LIBRARY START OF KEYBOARD EVENTS
	 * FROM WEBDRIVER LIBRARY START OF KEYBOARD EVENTS FROM WEBDRIVER LIBRARY
	 *************************************************/

	/**
	 * The method pressEnter will simulate pressing the Enter key from the
	 * keyboard on an element from the web.
	 *
	 */
	public DriverEvents pressEnter(By element) {
		wait = new WebDriverWait(driver, Constants.WAIT_FOR_ELEMENT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).sendKeys(Keys.ENTER);
		logger.info("-- ENTER KEY PRESSED ON A WEB ELEMENT --");
		return events;
	}

	/*
	 * START OF ALERT HANDLING EVENTS FROM WEBDRIVER LIBRARY START OF ALERT
	 * HANDLING EVENTS FROM WEBDRIVER LIBRARY START OF ALERT HANDLING EVENTS
	 * FROM WEBDRIVER LIBRARY
	 *************************************************/

	public DriverEvents alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return events;
	}

	public DriverEvents alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return events;
	}

	public String captureAlertText() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		return alertMessage;
	}

	public DriverEvents typeIntoAlertBox(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		return events;
	}

	public void hardWait(){
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deselectOptions(By element) {
		Select opt = new Select(driver.findElement(element));
		opt.deselectAll();

	}

}
