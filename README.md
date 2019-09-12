# search

# the problem

Write a program that given hundreds of documents, can find all the documents with words containing the letter "a" in them.

# First approach

Using the `with-open` macro that will automatically close any I/O.
The `clojure.string/includes?` function will check each line as it comes in if it contains the letter "a" and will return true or false.

```clojure
(defn contains-a?
  [document]
  (with-open [rdr (clojure.java.io/reader document)]
    (clojure.string/includes? (line-seq rdr) "a")))

(filter #(contains-a? %) [documents])
```
