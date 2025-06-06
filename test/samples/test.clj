;;; font locking
(ns clojure-mode.demo
 (:require
  [oneword]
  [seg.mnt]
  [mxdCase]
  [CmlCase]
  [ve/yCom|pLex.stu-ff]))

(defn foo [x] x)
;; try to byte-recompile the clojure-mode.el when the face of 'fn' is 't'
(fn foo [x] x)

(fn ^:m hello [x] @x)

(def ^:private my-var true)

(def ^Boolean x true)

(clojure.core/defmacro my-mac []
  `(let [x 1]
     ~x
     ~@x))

;; Built-ins should be highlighted only for `clojure.core` namespace.
(for [])
(clojure.core/for [])
(honey.sql/for {})

;; the "add" and "hello" should both have a function name face
(letfn [(add [x y]
          (+ x y))
        (hello [user]
          (println "Hello" user))]
  (dotimes [_ (add 6 8)]
    (hello "John Doe")))

;; the myfn sexp should have a comment face
(mysfn 101
       foo

       0 0i)

;; Function literals

^{:some "metadata"} #(let [foo     %
                           bar-zzz %]
                       foo)

#(or one
     two)

#(let [hello 1
       foo   "hone"]
   (pringln hello))

;; examples of valid namespace definitions
(comment
  (ns .validns)

  (ns =validns)
  (ns .ValidNs=<>?+|?*.)
  (ns ValidNs<>?+|?*.b*ar.ba*z)
  (ns other.valid.ns)
  (ns oneword)
  (ns one.X)
  (ns foo.bar)
  (ns Foo.bar)
  (ns Foo.Bar)
  (ns foo.Bar)
  (ns Foo-bar)
  (ns Foo-Bar)
  (ns foo-Bar))

(comment ;; for indentation
  'some/symbol

  (with-hi heya
    somebuddy)

  (deftoggle cap
    gabba)

  (couch/with-db hi
    your-db)

  (clo/defguppy gurgle
    minnow))

;; character literals
[\a \newline \u0032 \/ \+ \,, \; \( \% \)]

;; TODO change font-face for sexps starting with @,#
(comment ;; examples

  SCREAMING_UPPER_CASE
  ve/yCom|pLex.stu-ff/.SCREAMING_UPPER_CASE

  ^oneword
  @oneword
  #oneword
  #^oneword ;; type-hint
  .oneword
  (oneword)
  (oneword/oneword)
  (oneword/seg.mnt)
  (oneword/CmlCase)
  (oneword/mxdCase)
  (oneword/ve/yCom|pLex.stu-ff)
  (oneword/.ve/yCom|pLex.stu-ff)

  seg.mnt
  @seg.mnt
  #seg.mnt
  #^seg.mnt ;; type-hint
  .seg.mnt
  (seg.mnt)
  (seg.mnt/oneword)
  (seg.mnt/seg.mnt)
  (seg.mnt/CmlCase)
  (seg.mnt/mxdCase)
  (seg.mnt/ve/yCom|pLex.stu-ff)
  (seg.mnt/.ve/yCom|pLex.stu-ff)

  CmlCase
  @CmlCase
  #CmlCase
  #^CmlCase ;; type-hint
  .CmlCase
  (CmlCase)
  (CmlCase/oneword)
  (CmlCase/seg.mnt)
  (CmlCase/CmlCase)
  (CmlCase/mxdCase)
  (CmlCase/ve/yCom|pLex.stu-ff)
  (CmlCase/.ve/yCom|pLex.stu-ff)

  mxdCase
  @mxdCase
  #mxdCase
  #^mxdCase ;; type-hint
  .mxdCase
  (mxdCase)
  (mxdCase/oneword)
  (mxdCase/seg.mnt)
  (mxdCase/CmlCase)
  (mxdCase/mxdCase)
  (mxdCase/ve/yCom|pLex.stu-ff)
  (mxdCase/.ve/yCom|pLex.stu-ff)

  ve/yCom|pLex.stu-ff
  @ve/yCom|pLex.stu-ff
  #ve/yCom|pLex.stu-ff
  #^ve/yCom|pLex.stu-ff ;; type-hint
  .ve/yCom|pLex.stu-ff
  (ve/yCom|pLex.stu-ff)
  (ve/yCom|pLex.stu-ff/oneword)
  (ve/yCom|pLex.stu-ff/seg.mnt)
  (ve/yCom|pLex.stu-ff/CmlCase)
  (ve/yCom|pLex.stu-ff/mxdCase)
  (ve/yCom|pLex.stu-ff/ve/yCom|pLex.stu-ff)
  (ve/yCom|pLex.stu-ff/.ve/yCom|pLex.stu-ff)

  ::foo
  :_::_:foo
  :_:_:foo
  :foo/:bar
  ::_:foo
  ::_:_:foo

  :_:_:foo/_
  :_:_:foo/bar
  :_:_:foo/bar/eee
  :_:_:foo/bar_:foo
  :_:_:foo/bar_:_:foo

  ;; :_::_:foo/ ; invalid
  ;; :_::_:foo/: ; invalid
  ;; :_::_:foo/_ ; invalid
  ;; :_::_:foo/bar ; invalid
  ;; :_:_:foo/ ; invalid
  ;; :_:_:foo/: ; invalid
  ;; :::foo ; invalid
  ;; :_::foo ; invalid
  ;; :_:_:foo/: ; invalid
  ;; :_:_:foo/_: ; invalid
  ;; :_:_:foo/bar_: ; invalid
  ;; :_:_:foo/bar_::_:foo ; invalid
  ;; :foo/::bar ; invalid

  :oneword
  {:oneword 0}
  ;; {:@oneword 0} ; not allowed
  {:#oneword 0}
  {:.oneword 0}
  {:oneword/oneword 0}
  {:oneword/seg.mnt 0}
  {:oneword/CmlCase 0}
  {:oneword/mxdCase 0}
  {:oneword/ve/yCom|pLex.stu-ff 0}
  {:oneword/.ve/yCom|pLex.stu-ff 0}

  :1oneword
  :ns/1word
  :1ns/word
  :1ns/1word

  {:seg.mnt 0}
  ;; {:@seg.mnt 0} ; not allowed
  {:#seg.mnt 0}
  {:.seg.mnt 0}
  {:seg.mnt/oneword 0}
  {:seg.mnt/seg.mnt 0}
  {:seg.mnt/CmlCase 0}
  {:seg.mnt/mxdCase 0}
  {:seg.mnt/ve/yCom|pLex.stu-ff 0}
  {:seg.mnt/.ve/yCom|pLex.stu-ff 0}

  :CmlCase
  {:CmlCase 0}
  ;; {:@CmlCase 0} ; not allowed
  {:#CmlCase 0}
  {:.CmlCase 0}
  {:CmlCase/oneword 0}
  {:CmlCase/seg.mnt 0}
  {:CmlCase/CmlCase 0}
  {:CmlCase/mxdCase 0}
  {:CmlCase/ve/yCom|pLex.stu-ff 0}
  {:CmlCase/.ve/yCom|pLex.stu-ff 0}

  :mxdCase
  {:mxdCase 0}
  ;; {:@mxdCase 0} ; not allowed
  {:#mxdCase 0}
  {:.mxdCase 0}
  {:mxdCase/oneword 0}
  {:mxdCase/seg.mnt 0}
  {:mxdCase/CmlCase 0}
  {:mxdCase/mxdCase 0}
  {:mxdCase/ve/yCom|pLex.stu-ff 0}
  {:mxdCase/.ve/yCom|pLex.stu-ff 0}

  :ve/yCom|pLex.stu-ff
  {:ve/yCom|pLex.stu-ff 0}
  ;; {:@ve/yCom|pLex.stu-ff 0} ; not allowed
  {:#ve/yCom|pLex.stu-ff 0}
  {:.ve/yCom|pLex.stu-ff 0}
  {:ve/yCom|pLex.stu-ff 0}
  {:ve/yCom|pLex.stu-ff/oneword 0}
  {:ve/yCom|pLex.stu-ff/seg.mnt 0}
  {:ve/yCom|pLex.stu-ff/CmlCase 0}
  {:ve/yCom|pLex.stu-ff/mxdCase 0}
  {:ve/yCom|pLex.stu-ff/ve/yCom|pLex.stu-ff 0}
  {:ve/yCom|pLex.stu-ff/.ve/yCom|pLex.stu-ff 0}
  )

;; metadata doesn't break docstrings
(defn ^:mathy? max
  "Returns the greatest of the nums."
  {:added "1.0"
   :inline-arities >1?
   :inline (nary-inline 'max)}
  ([x] x)
  ([x y] (. clojure.lang.Numbers (max x y)))
  ([x y & more]
     (reduce1 max (max x y) more)))

;; definitions with metadata only don't cause freezing
(def ^String)
;; clojure-mode regression: the hanging metadata doesn't cause freezing
;; However, it does cause font locking on the top level of the next form (defmulti) to break.
;; Font locking resumes 1 list down in the next form, or picks back up on the following form (the defmethod)
;; There isn't much I can do to fix this, it's caused by an error thrown in the parser
;; which makes sense because it is an invalid form.
(defmulti multi (fn [a _] a))
(defmethod multi :test [_ b] b)
(defmethod multi :best [_ b] b)

(defn ^String reverse
  "Returns s with its characters reversed."
  {:added "1.2"}
  [^CharSequence s]
  (.toString (.reverse (StringBuilder. s))))

;; useful for testing docstring filling
(defn ^{::metadata "map"} say-hello
  "This is a long doc string to test clojure-fill-docstring. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus sed nunc luctus leo ultricies semper. Nullam id tempor mi. Cras adipiscing scelerisque purus, at semper magna tincidunt ut. Sed eget dolor vitae enim feugiat porttitor. Etiam vulputate pulvinar lacinia. Nam vitae nisl sit amet libero pulvinar pretium nec a dui. Ut luctus elit eu nulla posuere nec feugiat ipsum vehicula. Quisque eu pulvinar neque. Fusce fermentum adipiscing mauris, sit amet accumsan ante dignissim ac. Pellentesque molestie mollis condimentum.

Etiam commodo nulla id risus convallis pharetra. Integer dapibus, eros vitae vehicula rhoncus, nisl lorem ornare magna, eu vehicula justo nunc ac nunc. In dolor sem, vulputate eget vulputate id, euismod eu ligula. Nullam elit augue, ultrices ut pretium vel, bibendum sit amet est. Curabitur vulputate arcu vitae neque adipiscing vel commodo ante faucibus. Cras tempor placerat erat. Sed ultrices faucibus sodales. Vestibulum sollicitudin consectetur mauris, nec mollis quam accumsan ultrices. Vestibulum tincidunt libero a lectus condimentum et fermentum diam eleifend. Nam accumsan interdum neque nec aliquet. Praesent feugiat dui at est rhoncus lacinia."
  []
  (println "Hello, World!"))

(binding [*out* nil]
  #"regex string"
  (def #^Typehint x 1)
  (def #^:metadata x 1)
  (def ^Typehint x 2)
  (def ^:metadata x 2)
  #'name.sp-ace/var
  :name.spa-ce/keyword
  ::aliased/keyword
  'namespace/var
  :normal-keyword
  "string"
  123
  123.456
  true
  false
  nil
  @(atom #{1})
)

clojure.core/map

(.get ^ByteBuffer test/b)

(def ^Integer x 1)

^{:foo true}
(defn b "hello" [] "world")

^{:foo bar}
(def foo "usage" "hello")

(comment
  (defrecord TestRecord [field]
    AutoCloseable
    (close [this]
      (.close this)))

  (reify
    AutoCloseable
    (close [this] (.close this))

    (another [this arg]
      (implement this arg)))

  (definterface MyInterface
    (^String name [])
    (^double mass []))

  (defmulti my-method :hello :default ::default)

  (defmethod my-method :world
    [_]
    (println "Hi"))

  (deftype ImageSelection [data]
    Transferable
    (getTransferDataFlavors
      [this]
      (into-array DataFlavor [DataFlavor/imageFlavor]))

    (isDataFlavorSupported
      [this flavor]
      (= DataFlavor/imageFlavor flavor))

    (getTransferData
      [this flavor]
      (when (= DataFlavor/imageFlavor flavor)
        (.getImage (ImageIcon. data)))))

  (defprotocol P
    (foo [this])
    (bar-me [this] [this y])))
