# Changelog

## main (unreleased)

- Add a dedicated mode for editing Joker code. (`clojure-ts-joker-mode`).
- [#113](https://github.com/clojure-emacs/clojure-ts-mode/pull/113): Fix non-working refactoring commands for Emacs-30.
- [#114](https://github.com/clojure-emacs/clojure-ts-mode/pull/114): Extend built-in completion to complete keywords and local bindings in
  `for` and `doseq` forms.
- [#116](https://github.com/clojure-emacs/clojure-ts-mode/pull/116): Extend built-in completion to complete all imported symbols from an `ns`
  form.

## 0.5.1 (2025-06-17)

- [#109](https://github.com/clojure-emacs/clojure-ts-mode/issues/109): Improve performance by pre-compiling Tree-sitter queries.
- [#111](https://github.com/clojure-emacs/clojure-ts-mode/pull/111): Set `clojure-ts-completion-at-point-function` only for `clojure-ts-mode` buffers.

## 0.5.0 (2025-06-04)

- [#96](https://github.com/clojure-emacs/clojure-ts-mode/pull/96): Highlight function name properly in `extend-protocol` form.
- [#96](https://github.com/clojure-emacs/clojure-ts-mode/pull/96): Add support for extend-protocol forms to `clojure-ts-add-arity` refactoring
  command.
- [#99](https://github.com/clojure-emacs/clojure-ts-mode/pull/99): Improve navigation by s-expression by switching to an experimental
  Clojure grammar.
- [#99](https://github.com/clojure-emacs/clojure-ts-mode/pull/99): More consistent docstrings highlighting and `fill-paragraph` behavior.
- [#99](https://github.com/clojure-emacs/clojure-ts-mode/pull/99): Fix bug in `clojure-ts-align` when nested form has extra spaces.
- [#99](https://github.com/clojure-emacs/clojure-ts-mode/pull/99): Fix bug in `clojure-ts-unwind` when there is only one expression after
  threading symbol.
- [#103](https://github.com/clojure-emacs/clojure-ts-mode/issues/103): Introduce `clojure-ts-jank-use-cpp-parser` customization which allows
  highlighting C++ syntax in Jank `native/raw` forms.
- [#103](https://github.com/clojure-emacs/clojure-ts-mode/issues/103): Introduce `clojure-ts-clojurescript-use-js-parser` customization which
  allows highlighting JS syntax in ClojureScript `js*` forms.
- [#104](https://github.com/clojure-emacs/clojure-ts-mode/pull/104): Introduce the `clojure-ts-extra-def-forms` customization option to specify
  additional `defn`-like forms that should be fontified.
- [#108](https://github.com/clojure-emacs/clojure-ts-mode/pull/108): Introduce completion feature and `clojure-ts-completion-enabled`
  customization.

## 0.4.0 (2025-05-15)

- [#16](https://github.com/clojure-emacs/clojure-ts-mode/issues/16): Introduce `clojure-ts-align`.
- [#11](https://github.com/clojure-emacs/clojure-ts-mode/issues/11): Enable regex syntax highlighting.
- [#16](https://github.com/clojure-emacs/clojure-ts-mode/issues/16): Add support for automatic aligning forms.
- [#82](https://github.com/clojure-emacs/clojure-ts-mode/issues/82): Introduce `clojure-ts-outline-variant`.
- [#86](https://github.com/clojure-emacs/clojure-ts-mode/pull/86): Better handling of function literals:
  - Syntax highlighting of built-in keywords.
  - Consistent indentation with regular forms.
  - Support for automatic aligning forms.
- [#88](https://github.com/clojure-emacs/clojure-ts-mode/pull/88): Introduce `clojure-ts-unwind` and `clojure-ts-unwind-all`.
- [#89](https://github.com/clojure-emacs/clojure-ts-mode/pull/89): Introduce `clojure-ts-thread`, `clojure-ts-thread-first-all` and
  `clojure-ts-thread-last-all`.
- [#90](https://github.com/clojure-emacs/clojure-ts-mode/pull/90): Introduce `clojure-ts-cycle-privacy`.
- [#91](https://github.com/clojure-emacs/clojure-ts-mode/pull/91): Introduce `clojure-ts-cycle-keyword-string`.
- [#92](https://github.com/clojure-emacs/clojure-ts-mode/pull/92): Add commands to convert between collections types.
- [#93](https://github.com/clojure-emacs/clojure-ts-mode/pull/93): Introduce `clojure-ts-add-arity`.
- [#94](https://github.com/clojure-emacs/clojure-ts-mode/pull/94): Add indentation rules and `clojure-ts-align` support for namespaced maps.
- [#95](https://github.com/clojure-emacs/clojure-ts-mode/pull/95): Introduce `clojure-ts-cycle-conditional` and `clojure-ts-cycle-not`.

## 0.3.0 (2025-04-15)

- [#62](https://github.com/clojure-emacs/clojure-ts-mode/issues/62): Define `list` "thing" to improve navigation in Emacs 31.
- [#64](https://github.com/clojure-emacs/clojure-ts-mode/pull/64): Add defcustom `clojure-ts-auto-remap` to control remapping of `clojure-mode` buffers.
- [#66](https://github.com/clojure-emacs/clojure-ts-mode/pull/66): Improve syntax highlighting:
  - Highlight metadata with single keyword with `clojure-ts-keyword-face`.
  - Only highlight built-ins from `clojure.core` namespace.
  - Highlight named lambda functions properly.
  - Fix syntax highlighting for functions and vars with metadata on the previous
    line.
- [#67](https://github.com/clojure-emacs/clojure-ts-mode/pull/67): Improve semantic indentation rules to be more consistent with cljfmt.
- [#67](https://github.com/clojure-emacs/clojure-ts-mode/pull/67): Introduce `clojure-ts-semantic-indent-rules` customization option.
- [#61](https://github.com/clojure-emacs/clojure-ts-mode/issues/61): Fix issue with indentation of collection items with metadata.
- [#68](https://github.com/clojure-emacs/clojure-ts-mode/pull/68): Proper syntax highlighting for expressions with metadata.
- [#69](https://github.com/clojure-emacs/clojure-ts-mode/pull/69): Add basic support for dynamic indentation via `clojure-ts-get-indent-function`.
- [#70](https://github.com/clojure-emacs/clojure-ts-mode/pull/70): Add support for nested indentation rules.
- [#71](https://github.com/clojure-emacs/clojure-ts-mode/pull/71): Properly highlight function name in `letfn` form.
- [#72](https://github.com/clojure-emacs/clojure-ts-mode/pull/72): Pass fully qualified symbol to `clojure-ts-get-indent-function`.
- [#76](https://github.com/clojure-emacs/clojure-ts-mode/pull/76): Improve performance of semantic indentation by caching rules.
- [#74](https://github.com/clojure-emacs/clojure-ts-mode/issues/74): Add imenu support for keywords definitions.
- [#77](https://github.com/clojure-emacs/clojure-ts-mode/issues/77): Update grammars to the latest versions.
- [#79](https://github.com/clojure-emacs/clojure-ts-mode/pull/79): Improve markdown highlighting in the docstrings.
- [#60](https://github.com/clojure-emacs/clojure-ts-mode/issues/60): Fix issue with incorrect fontification, when `markdown-inline` is enabled.

## 0.2.3 (2025-03-04)

- [#38]: Add support for `in-ns` forms in `clojure-ts-find-ns`.
- [#46]: Fix missing `comment-add` variable in `clojure-ts-mode-variables` mentioned in [#26]
- Add imenu support for `deftest` definitions.
- [#53]: Let `clojure-ts-mode` derive from `clojure-mode` for Emacs 30+.
- [#42]: Fix imenu support for definitions with metadata.
- [#42]: Fix font locking of definitions with metadata.
- [#42]: Fix indentation of definitions with metadata.
- [#49]: Fix semantic indentation of quoted functions.
- [#58]: Add custom `fill-paragraph-function` which respects docstrings similar to
  `clojure-mode`.
- [#59]: Add customization option to disable markdown syntax highlighting in the
  docstrings.

## 0.2.2 (2024-02-16)

- [#37]: Fix derived modes broken with [#36].

## 0.2.1 (2024-02-14)

- [#36]: Rename all derived mode vars to match the package prefix.
  - `clojurescript-ts-mode` -> `clojure-ts-clojurescript-mode`
  - `clojurec-ts-mode` -> `clojure-ts-clojurec-mode`
  - `clojure-dart-ts-mode` -> `clojure-ts-clojuredart-mode`
  - `clojure-jank-ts-mode` -> `clojure-ts-jank-mode`
- [#30]: Add custom option `clojure-ts-toplevel-inside-comment-form` as an equivalent to `clojure-toplevel-inside-comment-form` in `clojure-mode`.
- [#32]: Change behavior of `beginning-of-defun` and `end-of-defun` to consider all Clojure sexps as defuns.

## 0.2.0

- Pin grammar revision in treesit-language-source-alist
  - [bd61a7fb281b7b0b1d2e20d19ab5d46cbcdc6c1e](https://github.com/clojure-emacs/clojure-ts-mode/commit/bd61a7fb281b7b0b1d2e20d19ab5d46cbcdc6c1e)
Make font lock feature list more conforming with recommendations
  - (See treesit-font-lock-level documentation for more information.)
  - [2225190ee57ef667d69f2cd740e0137810bc38e7](https://github.com/clojure-emacs/clojure-ts-mode/commit/2225190ee57ef667d69f2cd740e0137810bc38e7)
Highlight docstrings in interface, protocol, and variable definitions
  - [9af0a6b35c708309acdfeb4c0c79061b0fd4eb44](https://github.com/clojure-emacs/clojure-ts-mode/commit/9af0a6b35c708309acdfeb4c0c79061b0fd4eb44)
Add support for semantic indentation (now the default)
  - [ae2e2486010554cfeb12f06a1485b4d81609d964](https://github.com/clojure-emacs/clojure-ts-mode/commit/ae2e2486010554cfeb12f06a1485b4d81609d964)
  - [ca3914aa7aa9645ab244658f8db781cc6f95111e](https://github.com/clojure-emacs/clojure-ts-mode/commit/ca3914aa7aa9645ab244658f8db781cc6f95111e)
  - [85871fdbc831b3129dae5762e9c247d453c35e15](https://github.com/clojure-emacs/clojure-ts-mode/commit/85871fdbc831b3129dae5762e9c247d453c35e15)
  - [ff5d7e13dc53cc5da0e8139b04e02d90f61d9065](https://github.com/clojure-emacs/clojure-ts-mode/commit/ff5d7e13dc53cc5da0e8139b04e02d90f61d9065)
- Highlight "\`quoted-symbols\`  in docs strings like this."
  - This feature uses a nested markdown parser.
     If the parser is not available this feature should be silently disabled.
    - [9af0a6b35c708309acdfeb4c0c79061b0fd4eb44](https://github.com/clojure-emacs/clojure-ts-mode/commit/9af0a6b35c708309acdfeb4c0c79061b0fd4eb44)
- Highlight methods for `deftype`, `defrecord`, `defprotocol`, `reify` and `definterface`
  forms ([#20](https://github.com/clojure-emacs/clojure-ts-mode/issues/20)).
  - [5231c348e509cff91edd1ec59d7a59645395da15](https://github.com/clojure-emacs/clojure-ts-mode/commit/5231c348e509cff91edd1ec59d7a59645395da15)
  - Thank you rrudakov for this contribution.
- Add derived `clojure-jank-ts-mode` for the [Jank](https://github.com/jank-lang/jank) dialect of clojure
  - [a7b9654488693cdc9057a91410f74de42a397d1b](https://github.com/clojure-emacs/clojure-ts-mode/commit/a7b9654488693cdc9057a91410f74de42a397d1b)

## 0.1.5

- Disable treesit-transpose-sexps on Emacs 30 in favor of the default implementation (#17) [623c98292f9207a95169cdeae6f8595c016c6320](https://github.com/clojure-emacs/clojure-ts-mode/commit/623c98292f9207a95169cdeae6f8595c016c6320)
- Implement clojure-ts-find-ns function (mostly as a demonstration). [d630cd63af8022d5a1fee0e7aa05450b6e0fd75e](https://github.com/clojure-emacs/clojure-ts-mode/commit/d630cd63af8022d5a1fee0e7aa05450b6e0fd75e)

## 0.1.4

- Fix misplaced defcustom form in hastily release 0.1.3 [6cba90c556c7e658b815cdbb9b4243bde3273203](https://github.com/clojure-emacs/clojure-ts-mode/commit/6cba90c556c7e658b815cdbb9b4243bde3273203)

## 0.1.3

- Add custom option for highlighting comment macro body forms as comments. [ae3790adc0fc40ad905b8c30b152122991592a4e](https://github.com/clojure-emacs/clojure-ts-mode/commit/ae3790adc0fc40ad905b8c30b152122991592a4e)
  - Defaults to OFF, highlighting comment body forms like any other expressions.
  - Additionally, does a better job of better detecting comment macros by reducing false positives from forms like (not.clojure.core/comment)

## 0.1.2

- Add a syntax table from clojure-mode. [712dc772fd38111c1e35fe60e4dbe7ac83032bd6](https://github.com/clojure-emacs/clojure-ts-mode/commit/712dc772fd38111c1e35fe60e4dbe7ac83032bd6).
  - Better support for `thing-at-point` driven functionality.
  - Thank you @jasonjckn for this contribution.
- Add 3 derived major modes [4dc853df16ba09d10dc3a648865e681679c17606](https://github.com/clojure-emacs/clojure-ts-mode/commit/4dc853df16ba09d10dc3a648865e681679c17606)
  - clojurescript-ts-mode
  - clojurec-ts-mode
  - clojure-dart-ts-mode

## 0.1.1

- Fix bug with required emacs version [19b8e4260bfd459ad5771e06afb22c9af0ebc370](https://github.com/clojure-emacs/clojure-ts-mode/commit/19b8e4260bfd459ad5771e06afb22c9af0ebc370)

## 0.1.0

Initial release. Includes:

- Auto install of language grammar
- Font locking (syntax highlighting)
- Fixed style indentation
- imenu support
- which-function support
