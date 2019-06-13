/*
* Concurrent keywords:
* synchronized(X), this, wait(X), await() join(X), sleep(X), notify(X), notifyAll(), lock(), unlock(),
* singal(), signallAll(), acquire(), release(), countDown(), submit()
*
*/

grammar MutantGrammar;

concurrentKeyword
    :   SYNCHRONIZED
    |   WAIT
    |   AWAIT
    |   JOIN
    |   SLEEP
    |   NOTIFY
    |   NOTIFYALL
    |   LOCK
    |   UNLOCK
    |   SIGNAL
    |   SIGNALALL
    |   ACQUIRE
    |   RELEASE
    |   COUNTDOWN
    |   SUBMIT
    ;

rtxcMethod
    :   waitStatement
    |   joinCall
    |   sleepStatement
    |   notifyStatement
    |   notifyAllStatement
    ;

rcxcMethod
    :   lockCall
    |   unlockCall
    |   signalStatement
    |   signalAllStatement
    |   acquireCall
    |   releaseCall
    |   countDownCall
    |   submitCall
    ;

mxtMethod
    :   waitStatement
    |   awaitStatement
    |   sleepStatement
    |   joinCall
    ;

concurrentMethod
    :   concurrentKeyword '(' methodParameters? ')'
    ;

methodParameter
    :   .+?
    ;

methodParameters
    :   methodParameter (',' methodParameter)*
    ;

throwStatement
	:	'throw' .+? ';'
	;

methodCall
    :   variable (joinStatement
    | lockStatement
    | unlockStatement
    | acquireStatement
    | releaseStatement
    | countDownStatement
    | submitStatement)
    ;

joinCall
    :   variable joinStatement
    ;

lockCall
    :   variable lockStatement
    ;

unlockCall
    :   variable unlockStatement
    ;

acquireCall
    :   variable acquireStatement
    ;

releaseCall
    :   variable releaseStatement
    ;

countDownCall
    :   variable countDownStatement
    ;

submitCall
    :   variable submitStatement
    ;


joinStatement
    :   JOIN noParamEndStatement
    ;

synchronizedStatement
	:	SYNCHRONIZED '(' methodParameters ')' block
	;

waitStatement
    :   WAIT paramEndStatement
    ;

notifyStatement
    :   NOTIFY noParamEndStatement
    ;

notifyAllStatement
    :   NOTIFYALL noParamEndStatement
    ;

awaitStatement
    :   AWAIT noParamEndStatement
    ;

signalStatement
    :   SIGNAL noParamEndStatement
    ;

signalAllStatement
    :   SIGNALALL noParamEndStatement
    ;

sleepStatement
    :   SLEEP paramEndStatement
    ;

lockStatement
    :   LOCK noParamEndStatement
    ;

unlockStatement
    :   UNLOCK noParamEndStatement
    ;

acquireStatement
    :   ACQUIRE noParamEndStatement
    ;

releaseStatement
    :   RELEASE paramEndStatement
    ;

countDownStatement
    :   COUNTDOWN noParamEndStatement
    ;

submitStatement
    :   SUBMIT paramEndStatement
    ;

block
    :	'{' blockStatements? '}'
    ;

blockStatements
    :	blockStatement+
    ;

blockStatement
    :   .+?
    ;

brackets
    : '()'
    ;

noParamEndStatement
    : brackets ';'
    ;

paramEndStatement
    :   '('methodParameter?');'
    ;

variable
    :   Letter+ (Letter | UnderscoreOrDollar | Digit)*
    ;

// Keywords
SYNCHRONIZED: 'synchronized';
WAIT: 'wait';
AWAIT: 'await';
JOIN: 'join';
SLEEP: 'sleep';
NOTIFY: 'notify';
NOTIFYALL: 'notifyAll';
LOCK: 'lock';
UNLOCK: 'unlock';
SIGNAL: 'signal';
SIGNALALL: 'signalAll';
ACQUIRE: 'acquire';
RELEASE: 'release';
COUNTDOWN: 'countDown';
SUBMIT: 'submit';
THIS: 'this';

Digit
    :   [0-9]
    ;

Letter
    :   [A-Za-z]
    ;

UnderscoreOrDollar
    :   '_'
    |   '$'
    ;


