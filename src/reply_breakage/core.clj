(ns reply-breakage.core
  (:import (org.apache.commons.exec CommandLine DefaultExecutor
                                    PumpStreamHandler)
           java.io.File)
  (:gen-class
    (:main -main)))

(defn -main
  [commandstr] (let [cmd     (CommandLine/parse commandstr)
                     exec    (DefaultExecutor. )
                     handler (
                       PumpStreamHandler. System/out System/err System/in)
                     cwd     (File. (System/getProperty "user.dir"))]
    (prn cmd)
    (.setStreamHandler exec handler)
    (.setWorkingDirectory exec cwd)
    (let [status (.execute exec cmd (System/getenv))]
      (prn status)))
)
