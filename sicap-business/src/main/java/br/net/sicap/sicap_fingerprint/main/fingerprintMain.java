package br.net.sicap.sicap_fingerprint.main;

import sourceafis.simple.AfisEngine;
import sourceafis.simple.Finger;
import sourceafis.simple.Fingerprint;
import sourceafis.templates.CompactFormat;
import sourceafis.templates.IsoFormat;
import sourceafis.templates.SerializedFormat;
import sourceafis.templates.Template;
import sourceafis.templates.XmlFormat;

public class fingerprintMain {
	
	
	AfisEngine engine = new AfisEngine();
	Fingerprint fingerprint;
	Finger finger;
	private static final CompactFormat compactFormat = new CompactFormat();
	  private static final SerializedFormat serializedFormat = new SerializedFormat();
	  private static final IsoFormat isoFormat = new IsoFormat();
	  private static final XmlFormat xmlFormat = new XmlFormat();
	  private Finger fingerPosition;
	  Template decoded;
	 public Fingerprint main()
	  {
	    Fingerprint localFingerprint = new Fingerprint();
	    localFingerprint.clone() ;
	    return localFingerprint;
	  }
	 
	 public static void main(String[] args) {
		fingerprintMain teste = new fingerprintMain();
		Fingerprint t =  teste.main();

	} 
	
	

}
