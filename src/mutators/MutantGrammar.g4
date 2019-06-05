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

concurrentMethod
    :   concurrentKeyword '(' methodParameters? ')'
    ;

methodParameter
    :   .+
    ;

methodParameters
    :   methodParameter (',' methodParameter)*
    ;

throwStatement
	:	'throw' .* ';'
	;

synchronizedStatement
	:	'synchronized' '(' methodParameters ')' block
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
    :   .+
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



