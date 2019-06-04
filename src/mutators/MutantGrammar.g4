/*
* Concurrent keywords:
* synchronized(X), this, wait(X), await(X) join(X), sleep(X), notify(X), notifyAll(), lock(), unlock(),
* singal(), signallAll(), acquire(), release(), countDown(), submit()
*
*/

grammar MutantGrammar;

concurrentMethodName
    :   'synchronized'
    |   'wait'
    |   'await'
    |   'join'
    |   'sleep'
    |   'notify'
    |   'notifyAll'
    |   'lock'
    |   'unlock'
    |   'signal'
    |   'signalAll'
    |   'acquire'
    |   'release'
    |   'countDown'
    |   'submit'
    ;


