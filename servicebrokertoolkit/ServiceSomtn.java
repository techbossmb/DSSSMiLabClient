/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicebrokertoolkit;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor.SetterOnlyReflection;

/**
 *
 * @author Techbossmb
 */
public class ServiceSomtn {


			//import webservices.SbAuthHeader;

			public static String ID;
			//static
			public static SbAuthHeader broker = new SbAuthHeader();
                        public static SbAuthHeader auth = new SbAuthHeader();
                        public static void main(String[] args){
                            ServiceSomtn.setter();
                            ServiceSomtn.getter();
                        }

			public static String getLabServerID(){
				return ID;
			}
			public static void setLabServerID(String lsid){
				ServiceSomtn.ID = lsid;
			}
			public static void setter(){

				ServiceSomtn.broker.couponID = 1236544;
				ServiceSomtn.broker.couponPassKey = "2112545556";
				ServiceSomtn.setLabServerID("32d2412b8bc64f339f584af38ffb7050");
                               ServiceSomtn.auth = ServiceSomtn.broker;
                               System.out.println(ServiceSomtn.auth.couponID +"\n"+ ServiceSomtn.auth.couponPassKey);
			}
			public static void getter(){

				System.out.println(getLabServerID()+"\n"+ServiceSomtn.broker.getCouponID()+"\n"+ServiceSomtn.broker.getCouponPassKey()+"\n"+ServiceSomtn.broker);
						//broker.
//				ttt.text = getLabServerID();
//				ttt.text += SB.broker.couponID;
//				ttt.text += SB.broker.couponPassKey;
//				ttt.text += SB.broker;
			}

}
