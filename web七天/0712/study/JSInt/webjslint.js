// (C)2002 Douglas Crockford
// www.JSLint.com

Object.prototype.beget=function(){function F(){}
F.prototype=this;return new F();};String.prototype.entityify=function(){return this.replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;');};String.prototype.isAlpha=function(){return(this>='a'&&this<='z\uffff')||(this>='A'&&this<='Z\uffff');};String.prototype.isDigit=function(){return(this>='0'&&this<='9');};String.prototype.supplant=function(o){return this.replace(/{([^{}]*)}/g,function(a,b){var r=o[b];return typeof r==='string'||typeof r==='number'?r:a;});};var JSLINT;JSLINT=function(){var adsafe={activexobject:true,alert:true,back:true,body:true,close:true,confirm:true,cookie:true,constructor:true,createpopup:true,defaultstatus:true,defaultview:true,document:true,documentelement:true,domain:true,'eval':true,execScript:true,external:true,forms:true,forward:true,frameelement:true,fromcharcode:true,history:true,home:true,location:true,moveby:true,moveto:true,navigate:true,opener:true,parent:true,print:true,prompt:true,prototype:true,referrer:true,resizeby:true,resizeto:true,self:true,showhelp:true,showmodaldialog:true,status:true,stop:true,top:true,window:true,write:true,writeln:true,__proto__:true};var allOptions={adsafe:true,bitwise:true,browser:true,cap:true,debug:true,eqeqeq:true,evil:true,fragment:true,laxbreak:true,nomen:true,passfail:true,plusplus:true,rhino:true,undef:true,white:true,widget:true};var anonname;var browser={alert:true,blur:true,clearInterval:true,clearTimeout:true,close:true,closed:true,confirm:true,console:true,Debug:true,defaultStatus:true,document:true,event:true,focus:true,frames:true,history:true,Image:true,length:true,location:true,moveBy:true,moveTo:true,name:true,navigator:true,onblur:true,onerror:true,onfocus:true,onload:true,onresize:true,onunload:true,open:true,opener:true,opera:true,parent:true,print:true,prompt:true,resizeBy:true,resizeTo:true,screen:true,scroll:true,scrollBy:true,scrollTo:true,self:true,setInterval:true,setTimeout:true,status:true,top:true,window:true,XMLHttpRequest:true};var funlab;var funstack;var functions;var globals;var inblock;var indent;var konfab={alert:true,appleScript:true,animator:true,appleScript:true,beep:true,bytesToUIString:true,Canvas:true,chooseColor:true,chooseFile:true,chooseFolder:true,convertPathToHFS:true,convertPathToPlatform:true,closeWidget:true,COM:true,CustomAnimation:true,escape:true,FadeAnimation:true,filesystem:true,focusWidget:true,form:true,Frame:true,HotKey:true,Image:true,include:true,isApplicationRunning:true,iTunes:true,konfabulatorVersion:true,log:true,MenuItem:true,MoveAnimation:true,openURL:true,play:true,Point:true,popupMenu:true,preferenceGroups:true,preferences:true,print:true,prompt:true,reloadWidget:true,resolvePath:true,resumeUpdates:true,RotateAnimation:true,runCommand:true,runCommandInBg:true,saveAs:true,savePreferences:true,screen:true,ScrollBar:true,showWidgetPreferences:true,sleep:true,speak:true,suppressUpdates:true,system:true,tellWidget:true,Text:true,TextArea:true,unescape:true,updateNow:true,URL:true,Window:true,XMLDOM:true,XMLHttpRequest:true,yahooCheckLogin:true,yahooLogin:true,yahooLogout:true};var lines;var lookahead;var member;var nexttoken;var noreach;var option;var prevtoken;var quit;var rhino={defineClass:true,deserialize:true,gc:true,help:true,load:true,loadClass:true,print:true,quit:true,readFile:true,readUrl:true,runCommand:true,seal:true,serialize:true,spawn:true,sync:true,toint32:true,version:true};var stack;var standard={Array:true,Boolean:true,Date:true,decodeURI:true,decodeURIComponent:true,encodeURI:true,encodeURIComponent:true,Error:true,escape:true,'eval':true,EvalError:true,Function:true,isFinite:true,isNaN:true,Math:true,Number:true,Object:true,parseInt:true,parseFloat:true,RangeError:true,ReferenceError:true,RegExp:true,String:true,SyntaxError:true,TypeError:true,unescape:true,URIError:true};var syntax={};var token;var verb;var warnings;var wmode;var xmode;var xtype;var tx=/^\s*([(){}[.,:;'"~]|\](\]>)?|\?>?|==?=?|\/(\*(global|extern|jslint)?|=|\/)?|\*[\/=]?|\+[+=]?|-[-=]?|%[=>]?|&[&=]?|\|[|=]?|>>?>?=?|<([\/=%\?]|\!(\[|--)?|<=?)?|\^=?|\!=?=?|[a-zA-Z_$][a-zA-Z0-9_$]*|[0-9]+([xX][0-9a-fA-F]+|\.[0-9]*)?([eE][+-]?[0-9]+)?)/;var rx=/^(\\[^\x00-\x1f]|\[(\\[^\x00-\x1f]|[^\x00-\x1f\\\/])*\]|[^\x00-\x1f\\\/\[])+\/[gim]*/;var lx=/\*\/|\/\*/;var gx=/^\s*([a-zA-Z_$][a-zA-Z0-9_$]*)/;var ix=/^([a-zA-Z_$][a-zA-Z0-9_$]*$)/;var hx=/^[\x00-\x20]*(,|\*\/)/;var bx=/^\s*(true|false)/;var cx=/^\s*(:)/;var jx=/(javascript|jscript|ecmascript)\s*:/i;function warning(m,t,a,b,c,d){var ch,l,w;t=t||nexttoken;if(t.id==='(end)'){t=token;}
l=t.line||0;ch=t.from||0;w={id:'(error)',raw:m,evidence:lines[l]||'',line:l,character:ch,a:a,b:b,c:c,d:d};w.reason=m.supplant(w);JSLINT.errors.push(w);if(option.passfail){quit('Stopping. ',l,ch);}
warnings+=1;if(warnings===50){quit("Too many errors.",l,ch);}
return w;}
function warningAt(m,l,ch,a,b,c,d){return warning(m,{line:l,from:ch},a,b,c,d);}
function error(m,t,a,b,c,d){var w=warning(m,t,a,b,c,d);quit("Stopping, unable to continue.",w.line,w.character);}
function errorAt(m,l,ch,a,b,c,d){return error(m,{line:l,from:ch},a,b,c,d);}
quit=function quit(m,l,ch){warningAt("{a} ({b}% scanned).",l,ch,m,Math.floor((l/lines.length)*100));JSLINT.errors.push(null);throw null;};var lex=function(){var character;var from;var line;var s;function nextLine(){line+=1;if(line>=lines.length){return false;}
character=0;s=lines[line];return true;}
function it(type,value,quote){var t;if(option.adsafe&&adsafe.hasOwnProperty(value.toLowerCase())){warning("Adsafe restricted word '{a}'.",{line:line,from:character},value);}
if(type==='(punctuator)'||(type==='(identifier)'&&syntax.hasOwnProperty(value))){t=syntax[value];if(!t.id){t=syntax[type];}}else{t=syntax[type];}
t=t.beget();if(value||type==='(string)'){if(/(javascript|jscript|ecmascript)\s*:/i.test(value)){warningAt("JavaScript URL.",line,from);}
t.value=value;}
t.line=line;t.character=character;t.from=from;t.quote=quote;return t;}
return{init:function(source){if(typeof source==='string'){lines=source.split('\r\n');if(lines.length===1){lines=lines[0].split('\n');if(lines.length===1){lines=lines[0].split('\r');}}}else{lines=source;}
line=0;character=0;from=0;s=lines[0];},token:function(){var c;var i;var l;var r;var t;function match(x){var r=x.exec(s),r1;if(r){l=r[0].length;r1=r[1];c=r1.charAt(0);s=s.substr(l);character+=l;from=character-r1.length;return r1;}}
function more(){while(!s){if(!nextLine()){errorAt("Unclosed comment.",line,character);}}}
function string(x){var c,j,r='';if(xmode===x||xmode==='string'){return it('(punctuator)',x);}
function esc(n){var i=parseInt(s.substr(j+1,n),16);j+=n;if(i>=32&&i<=127){warningAt("Unnecessary escapement.",line,character);}
character+=n;c=String.fromCharCode(i);}
for(j=0;j<s.length;j+=1){c=s.charAt(j);if(c===x){character+=1;s=s.substr(j+1);return it('(string)',r,x);}
if(c<' '){if(c==='\n'||c==='\r'){break;}
warningAt("Control character in string: {a}.",line,character+j,s.substring(0,j));}
if(c==='\\'){j+=1;character+=1;c=s.charAt(j);switch(c){case'\\':case'\'':case'"':case'/':break;case'b':c='\b';break;case'f':c='\f';break;case'n':c='\n';break;case'r':c='\r';break;case't':c='\t';break;case'u':esc(4);break;case'v':c='\v';break;case'x':esc(2);break;default:warningAt("Bad escapement.",line,character);}}
r+=c;character+=1;}
errorAt("Unclosed string.",line,from);}
for(;;){if(!s){return it(nextLine()?'(endline)':'(end)','');}
t=match(tx);if(!t){t='';c='';while(s&&s<'!'){s=s.substr(1);}
if(s){errorAt("Unexpected '{a}'.",line,character,s.substr(0,1));}}
if(c.isAlpha()||c==='_'||c==='$'){return it('(identifier)',t);}
if(c.isDigit()){if(!isFinite(Number(t))){warningAt("Bad number '{a}'.",line,character,t);}
if(s.substr(0,1).isAlpha()){warningAt("Missing space after '{a}'.",line,character,t);}
if(c==='0'&&t.substr(1,1).isDigit()){warningAt("Don't use extra leading zeros '{a}'.",line,character,t);}
if(t.substr(t.length-1)==='.'){warningAt("A trailing decimal point can be confused with a dot '{a}'.",line,character,t);}
return it('(number)',t);}
switch(t){case'"':case"'":return string(t);case'//':s='';break;case'/*':for(;;){i=s.search(lx);if(i>=0){break;}
if(!nextLine()){errorAt("Unclosed comment.",line,character);}}
character+=i+2;if(s.substr(i,1)==='/'){errorAt("Nested comment.",line,character);}
s=s.substr(i+2);break;case'/*extern':case'/*global':for(;;){more();r=match(hx);if(r==='*/'){break;}
if(r!==','){more();r=match(gx);if(r){globals[r]=true;}else{errorAt("Bad extern identifier '{a}'.",line,character,s);}}}
return this.token();case'/*jslint':if(option.adsafe){errorAt("Adsafe restriction.",line,character);}
for(;;){more();r=match(hx);if(r==='*/'){break;}
if(r!==','){more();r=match(gx);if(r){if(!allOptions.hasOwnProperty(r)){errorAt("Bad jslint option '{a}'.",line,character,r);}
more();if(!match(cx)){errorAt("Missing ':' after '{a}'.",line,character,r);}
more();t=match(bx);if(!t){errorAt("Missing boolean after '{a}'.",line,character,r);}
option[r]=t==='true';}else{errorAt("Bad jslint option '{a}'.",line,character,s);}}}
break;case'*/':errorAt("Unbegun comment.",line,character);break;case'':break;default:return it('(punctuator)',t);}}},skip:function(p){var i,t=p;if(nexttoken.id){if(!t){t='';if(nexttoken.id.substr(0,1)==='<'){lookahead.push(nexttoken);return true;}}else if(nexttoken.id.indexOf(t)>=0){return true;}}
token=nexttoken;nexttoken=syntax['(end)'];for(;;){i=s.indexOf(t||'<');if(i>=0){character+=i+t.length;s=s.substr(i+t.length);return true;}
if(!nextLine()){break;}}
return false;},regex:function(){var l;var r=rx.exec(s);var x;if(r){l=r[0].length;character+=l;s=s.substr(l);x=r[1];return it('(regex)',x);}
errorAt("Bad regular expression.",line,character);}};}();function builtin(name){return standard[name]===true||globals[name]===true||(option.rhino&&rhino[name]===true)||((xtype==='widget'||option.widget)&&konfab[name]===true)||((xtype==='html'||option.browser)&&browser[name]===true);}
function addlabel(t,type){if(t){if(typeof funlab[t]==='string'){switch(funlab[t]){case'var':case'var*':if(type==='global'){funlab[t]='var*';return;}
break;case'global':if(type==='var'){warning("Variable {a} was used before it was declared.",token,t);return;}
if(type==='var*'||type==='global'){return;}
break;case'function':case'parameter':if(type==='global'){return;}
break;}
warning("Identifier {a} already declared as {b}.",token,t,funlab[t]);}
funlab[t]=type;}}
function peek(p){var i=p||0,j=0;var t;while(j<=i){t=lookahead[j];if(!t){t=lookahead[j]=lex.token();}
j+=1;}
return t;}
var badbreak={')':true,']':true,'++':true,'--':true};function advance(id,t){var l;switch(token.id){case'(number)':if(nexttoken.id==='.'){warning("A dot following a number can be confused with a decimal point.",token);}
break;case'-':if(nexttoken.id==='-'||nexttoken.id==='--'){warning("Confusing minusses.");}
break;case'+':if(nexttoken.id==='+'||nexttoken.id==='++'){warning("Confusing plusses.");}
break;}
if(token.type==='(string)'||token.identifier){anonname=token.value;}
if(id&&nexttoken.value!==id){if(t){if(nexttoken.id==='(end)'){warning("Unmatched '{a}'.",t,t.id);}else{warning("Expected '{a}' to match '{b}' from line {c} and instead saw '{d}'.",nexttoken,id,t.id,t.line+1,nexttoken.value);}}else{warning("Expected '{a}' and instead saw '{b}'.",nexttoken,id,nexttoken.value);}}
prevtoken=token;token=nexttoken;for(;;){nexttoken=lookahead.shift()||lex.token();if(nexttoken.id==='<!['){if(xtype==='html'){error("Unexpected '{a}'.",nexttoken,'<![');}
if(xmode==='script'){nexttoken=lex.token();if(nexttoken.value!=='CDATA'){error("Missing '{a}'.",nexttoken,'CDATA');}
nexttoken=lex.token();if(nexttoken.id!=='['){error("Missing '{a}'.",nexttoken,'[');}
xmode='CDATA';}else if(xmode==='xml'){lex.skip(']]>');}else{error("Unexpected '{a}'.",nexttoken,'<![');}}else if(nexttoken.id===']]>'){if(xmode==='CDATA'){xmode='script';}else{error("Unexpected '{a}'.",nexttoken,']]>');}}else if(nexttoken.id!=='(endline)'){break;}
if(xmode==='"'||xmode==="'"){error("Missing '{a}'.",token,xmode);}
l=!xmode&&!option.laxbreak&&(token.type==='(string)'||token.type==='(number)'||token.type==='(identifier)'||badbreak[token.id]);}
if(l){switch(nexttoken.id){case'{':case'}':case']':break;case')':switch(token.id){case')':case'}':case']':break;default:warning("Line breaking error '{a}'.",token,')');}
break;default:warning("Line breaking error '{a}'.",token,token.value);}}
if(xtype==='widget'&&xmode==='script'&&nexttoken.id){l=nexttoken.id.charAt(0);if(l==='<'||l==='&'){nexttoken.nud=nexttoken.led=null;nexttoken.lbp=0;nexttoken.reach=true;}}}
function advanceregex(){nexttoken=lex.regex();}
function beginfunction(i){var f={'(name)':i,'(line)':nexttoken.line+1,'(context)':funlab};funstack.push(funlab);funlab=f;functions.push(funlab);}
function endfunction(){funlab=funstack.pop();}
function parse(rbp,initial){var l;var left;var o;if(nexttoken.id&&nexttoken.id==='/'){if('(=:,!?[&|'.indexOf(token.id.charAt(0))<0){warning("Expected to see a '(' or '=' or ':' or ',' or '[' preceding a regular expression literal, and instead saw '{a}'.",token,token.value);}
advanceregex();}
if(nexttoken.id==='(end)'){error("Unexpected early end of program.",token);}
advance();if(initial){anonname='anonymous';verb=token.value;}
if(initial&&token.fud){token.fud();}else{if(token.nud){o=token.exps;left=token.nud();}else{if(nexttoken.type==='(number)'&&token.id==='.'){warning("A leading decimal point can be confused with a dot: '.{a}'.",token,nexttoken.value);advance();return token;}else{error("Expected an identifier and instead saw '{a}'.",token,token.id);}}
while(rbp<nexttoken.lbp){o=nexttoken.exps;advance();if(token.led){left=token.led(left);}else{error("Expected an operator and instead saw '{a}'.",token,token.id);}}
if(initial&&!o){warning("Expected an assignment or function call and instead saw an expression.",token);}}
if(l){funlab[l]='label';}
if(!option.evil&&left&&left.value==='eval'){warning("eval is evil.",left);}
return left;}
function adjacent(left,right){if(option.white){if(left.character!==right.from){warning("Unexpected space after '{a}'.",nexttoken,left.value);}}}
function nonadjacent(left,right){if(option.white){if(left.character===right.from){warning("Missing space after '{a}'.",nexttoken,left.value);}}}
function indentation(bias){var i;if(option.white&&nexttoken.id!=='(end)'){i=indent+(bias||0);if(nexttoken.from!==i){warning("Expected '{a}' to have an indentation of {b} instead of {c}.",nexttoken,nexttoken.value,i,nexttoken.from);}}}
function symbol(s,p){return syntax[s]||(syntax[s]={id:s,lbp:p,value:s});}
function delim(s){return symbol(s,0);}
function stmt(s,f){var x=delim(s);x.identifier=x.reserved=true;x.fud=f;return x;}
function blockstmt(s,f){var x=stmt(s,f);x.block=true;return x;}
function reserveName(x){var c=x.id.charAt(0);if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){x.identifier=x.reserved=true;}
return x;}
function prefix(s,f){var x=symbol(s,150);reserveName(x);x.nud=(typeof f==='function')?f:function(){if(option.plusplus&&(this.id==='++'||this.id==='--')){warning("Unexpected use of '{a}'.",this,this.id);}
parse(150);return this;};return x;}
function type(s,f){var x=delim(s);x.type=s;x.nud=f;return x;}
function reserve(s,f){var x=type(s,f);x.identifier=x.reserved=true;return x;}
function reservevar(s){return reserve(s,function(){return this;});}
function infix(s,f,p){var x=symbol(s,p);reserveName(x);x.led=(typeof f==='function')?f:function(left){nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);return[this.id,left,parse(p)];};return x;}
function relation(s,f){var x=symbol(s,100);x.led=function(left){nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);var right=parse(100);if((left&&left.id==='NaN')||(right&&right.id==='NaN')){warning("Use the isNaN function to compare with NaN.",this);}else if(f){f.apply(this,[left,right]);}
return[this.id,left,right];};return x;}
function isPoorRelation(node){return(node.type==='(number)'&&!+node.value)||(node.type==='(string)'&&!node.value)||node.type==='true'||node.type==='false'||node.type==='undefined'||node.type==='null';}
function assignop(s,f){symbol(s,20).exps=true;return infix(s,function(left){nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);if(left){if(left.id==='.'||left.id==='['||(left.identifier&&!left.reserved)){parse(19);return left;}
if(left===syntax['function']){warning("Expected an identifier in an assignment and instead saw a function invocation.",token);}}
error("Bad assignment.",this);},20);}
function bitwise(s,f,p){var x=symbol(s,p);reserveName(x);x.led=(typeof f==='function')?f:function(left){if(option.bitwise){warning("Unexpected use of '{a}'.",this,this.id);}
nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);return[this.id,left,parse(p)];};return x;}
function bitwiseassignop(s){symbol(s,20).exps=true;return infix(s,function(left){if(option.bitwise){warning("Unexpected use of '{a}'.",this,this.id);}
nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);if(left){if(left.id==='.'||left.id==='['||(left.identifier&&!left.reserved)){parse(19);return left;}
if(left===syntax['function']){warning("Expected an identifier in an assignment, and instead saw a function invocation.",token);}}
error("Bad assignment.",this);},20);}
function suffix(s,f){var x=symbol(s,150);x.led=function(left){if(option.plusplus){warning("Unexpected use of '{a}'.",this,this.id);}
return[f,left];};return x;}
function optionalidentifier(){if(nexttoken.reserved){warning("Expected an identifier and instead saw '{a}' (a reserved word).",nexttoken,nexttoken.id);}
if(nexttoken.identifier){if(option.nomen){if(nexttoken.value.charAt(0)==='_'||nexttoken.value.indexOf('$')>=0){warning("Unexpected characters in '{a}'.",nexttoken,nexttoken.value);}}
advance();return token.value;}}
function identifier(){var i=optionalidentifier();if(i){return i;}
if(token.id==='function'&&nexttoken.id==='('){warning("Missing name in function statement.");}else{error("Expected an identifier and instead saw '{a}'.",nexttoken,nexttoken.value);}}
function reachable(s){var i=0;var t;if(nexttoken.id!==';'||noreach){return;}
for(;;){t=peek(i);if(t.reach){return;}
if(t.id!=='(endline)'){if(t.id==='function'){warning("Inner functions should be listed at the top of the outer function.",t);break;}
warning("Unreachable '{a}' after '{b}'.",t,t.value,s);break;}
i+=1;}}
function statement(){var t=nexttoken;if(t.id===';'){warning("Unnecessary semicolon.",t);advance(';');return;}
if(t.identifier&&!t.reserved&&peek().id===':'){advance();advance(':');addlabel(t.value,'live*');if(!nexttoken.labelled){warning("Label '{a}' on {b} statement.",nexttoken,t.value,nexttoken.value);}
if(jx.test(t.value+':')){warning("Label '{a}' looks like a javascript url.",t,t.value);}
nexttoken.label=t.value;t=nexttoken;}
parse(0,true);if(!t.block){if(nexttoken.id!==';'){warningAt("Missing semicolon.",token.line,token.from+token.value.length);}else{adjacent(token,nexttoken);advance(';');nonadjacent(token,nexttoken);}}}
function statements(){while(!nexttoken.reach&&nexttoken.id!=='(end)'){indentation();statement();}}
function block(f){var b=inblock;inblock=f;nonadjacent(token,nexttoken);var t=nexttoken;if(nexttoken.id==='{'){advance('{');if(nexttoken.id!=='}'||token.line!==nexttoken.line){indent+=4;statements();indent-=4;indentation();}
advance('}',t);}else{warning("Expected '{a}' and instead saw '{b}'.",nexttoken,'{',nexttoken.value);noreach=true;statement();noreach=false;}
verb=null;inblock=b;}
function idValue(){return this;}
function countMember(m){if(typeof member[m]==='number'){member[m]+=1;}else{member[m]=1;}}
var scriptstring={onblur:true,onchange:true,onclick:true,ondblclick:true,onfocus:true,onkeydown:true,onkeypress:true,onkeyup:true,onload:true,onmousedown:true,onmousemove:true,onmouseout:true,onmouseover:true,onmouseup:true,onreset:true,onselect:true,onsubmit:true,onunload:true};var xmltype={HTML:{doBegin:function(n){if(!option.cap){warning("HTML case error.");}
xmltype.html.doBegin();}},html:{doBegin:function(n){xtype='html';xmltype.html.script=false;},doTagName:function(n,p){var i;var t=xmltype.html.tag[n];var x;if(!t){error("Unrecognized tag '<{a}>'.",nexttoken,n===n.toLowerCase()?n:n+' (capitalization error)');}
x=t.parent;if(x){if(x.indexOf(' '+p+' ')<0){error("A '<{a}>' must be within '<{b}>'.",token,n,x);}}else{i=stack.length;do{if(i<=0){error("A '<{a}>' must be within '<{b}>'.",token,n,'body');}
i-=1;}while(stack[i].name!=='body');}
xmltype.html.script=n==='script';return t.empty;},doAttribute:function(n,a){if(n==='script'){if(a==='src'){xmltype.html.script=false;return'string';}else if(a==='language'){warning("The 'language' attribute is deprecated.",token);return false;}}
if(a==='href'){return'href';}
return scriptstring[a]&&'script';},doIt:function(n){return xmltype.html.script?'script':n!=='html'&&xmltype.html.tag[n].special&&'special';},tag:{a:{},abbr:{},acronym:{},address:{},applet:{},area:{empty:true,parent:' map '},b:{},base:{empty:true,parent:' head '},bdo:{},big:{},blockquote:{},body:{parent:' html noframes '},br:{empty:true},button:{},canvas:{parent:' body p div th td '},caption:{parent:' table '},center:{},cite:{},code:{},col:{empty:true,parent:' table colgroup '},colgroup:{parent:' table '},dd:{parent:' dl '},del:{},dfn:{},dir:{},div:{},dl:{},dt:{parent:' dl '},em:{},embed:{},fieldset:{},font:{},form:{},frame:{empty:true,parent:' frameset '},frameset:{parent:' html frameset '},h1:{},h2:{},h3:{},h4:{},h5:{},h6:{},head:{parent:' html '},html:{},hr:{empty:true},i:{},iframe:{},img:{empty:true},input:{empty:true},ins:{},kbd:{},label:{},legend:{parent:' fieldset '},li:{parent:' dir menu ol ul '},link:{empty:true,parent:' head '},map:{},menu:{},meta:{empty:true,parent:' head noscript '},noframes:{parent:' html body '},noscript:{parent:' applet blockquote body button center dd del div fieldset form frameset head html iframe ins li map noframes noscript object td th '},object:{},ol:{},optgroup:{parent:' select '},option:{parent:' optgroup select '},p:{},param:{empty:true,parent:' applet object '},pre:{},q:{},samp:{},script:{parent:' head body p div span abbr acronym address bdo blockquote cite code del dfn em ins kbd pre samp strong table tbody td th tr var '},select:{},small:{},span:{},strong:{},style:{parent:' head ',special:true},sub:{},sup:{},table:{},tbody:{parent:' table '},td:{parent:' tr '},textarea:{},tfoot:{parent:' table '},th:{parent:' tr '},thead:{parent:' table '},title:{parent:' head '},tr:{parent:' table tbody thead tfoot '},tt:{},u:{},ul:{},'var':{}}},widget:{doBegin:function(n){xtype='widget';},doTagName:function(n,p){var t=xmltype.widget.tag[n];if(!t){error("Unrecognized tag '<{a}>'.",nexttoken,n);}
var x=t.parent;if(x.indexOf(' '+p+' ')<0){error("A '<{a}>' must be within '<{b}>'.",token,n,x);}},doAttribute:function(n,a){var t=xmltype.widget.tag[a];if(!t){error("Unrecognized attribute '<{a} {b}>'.",nexttoken,n,a);}
var x=t.parent;if(x.indexOf(' '+n+' ')<0){error("Attribute '{a}' does not belong in '<{b}>'.",nexttoken,a,n);}
return t.script?'script':a==='name'?'define':'string';},doIt:function(n){var x=xmltype.widget.tag[n];return x&&x.script&&'script';},tag:{"about-box":{parent:' widget '},"about-image":{parent:' about-box '},"about-text":{parent:' about-box '},"about-version":{parent:' about-box '},action:{parent:' widget ',script:true},alignment:{parent:' canvas frame image scrollbar text textarea window '},anchorStyle:{parent:' text '},author:{parent:' widget '},autoHide:{parent:' scrollbar '},beget:{parent:' canvas frame image scrollbar text window '},bgColor:{parent:' text textarea '},bgColour:{parent:' text textarea '},bgOpacity:{parent:' text textarea '},canvas:{parent:' frame window '},checked:{parent:' image menuItem '},clipRect:{parent:' image '},color:{parent:' about-text about-version shadow text textarea '},colorize:{parent:' image '},colour:{parent:' about-text about-version shadow text textarea '},columns:{parent:' textarea '},company:{parent:' widget '},contextMenuItems:{parent:' canvas frame image scrollbar text textarea window '},copyright:{parent:' widget '},data:{parent:' about-text about-version text textarea '},debug:{parent:' widget '},defaultValue:{parent:' preference '},defaultTracking:{parent:' widget '},description:{parent:' preference '},directory:{parent:' preference '},editable:{parent:' textarea '},enabled:{parent:' menuItem '},extension:{parent:' preference '},file:{parent:' action preference '},fillMode:{parent:' image '},font:{parent:' about-text about-version text textarea '},fontStyle:{parent:' textarea '},frame:{parent:' frame window '},group:{parent:' preference '},hAlign:{parent:' canvas frame image scrollbar text textarea '},handleLinks:{parent:' textArea '},height:{parent:' canvas frame image scrollbar text textarea window '},hidden:{parent:' preference '},hLineSize:{parent:' frame '},hOffset:{parent:' about-text about-version canvas frame image scrollbar shadow text textarea window '},hotkey:{parent:' widget '},hRegistrationPoint:{parent:' canvas frame image scrollbar text '},hScrollBar:{parent:' frame '},hslAdjustment:{parent:' image '},hslTinting:{parent:' image '},icon:{parent:' preferenceGroup '},id:{parent:' canvas frame hotkey image preference text textarea timer scrollbar widget window '},image:{parent:' about-box frame window widget '},interval:{parent:' action timer '},key:{parent:' hotkey '},kind:{parent:' preference '},level:{parent:' window '},lines:{parent:' textarea '},loadingSrc:{parent:' image '},locked:{parent:' window '},max:{parent:' scrollbar '},maxLength:{parent:' preference '},menuItem:{parent:' contextMenuItems '},min:{parent:' scrollbar '},minimumVersion:{parent:' widget '},minLength:{parent:' preference '},missingSrc:{parent:' image '},modifier:{parent:' hotkey '},name:{parent:' canvas frame hotkey image preference preferenceGroup scrollbar text textarea timer widget window '},notSaved:{parent:' preference '},onClick:{parent:' canvas frame image scrollbar text textarea ',script:true},onContextMenu:{parent:' canvas frame image scrollbar text textarea window ',script:true},onDragDrop:{parent:' canvas frame image scrollbar text textarea ',script:true},onDragEnter:{parent:' canvas frame image scrollbar text textarea ',script:true},onDragExit:{parent:' canvas frame image scrollbar text textarea ',script:true},onFirstDisplay:{parent:' window ',script:true},onGainFocus:{parent:' textarea window ',script:true},onKeyDown:{parent:' hotkey text textarea window ',script:true},onKeyPress:{parent:' textarea window ',script:true},onKeyUp:{parent:' hotkey text textarea window ',script:true},onImageLoaded:{parent:' image ',script:true},onLoseFocus:{parent:' textarea window ',script:true},onMouseDown:{parent:' canvas frame image scrollbar text textarea window ',script:true},onMouseDrag:{parent:' canvas frame image scrollbar text textArea window ',script:true},onMouseEnter:{parent:' canvas frame image scrollbar text textarea window ',script:true},onMouseExit:{parent:' canvas frame image scrollbar text textarea window ',script:true},onMouseMove:{parent:' canvas frame image scrollbar text textarea window ',script:true},onMouseUp:{parent:' canvas frame image scrollbar text textarea window ',script:true},onMouseWheel:{parent:' frame ',script:true},onMultiClick:{parent:' canvas frame image scrollbar text textarea window ',script:true},onSelect:{parent:' menuItem ',script:true},onTextInput:{parent:' window ',script:true},onTimerFired:{parent:' timer ',script:true},onValueChanged:{parent:' scrollbar ',script:true},opacity:{parent:' canvas frame image scrollbar shadow text textarea window '},option:{parent:' preference widget '},optionValue:{parent:' preference '},order:{parent:' preferenceGroup '},orientation:{parent:' scrollbar '},pageSize:{parent:' scrollbar '},preference:{parent:' widget '},preferenceGroup:{parent:' widget '},remoteAsync:{parent:' image '},requiredPlatform:{parent:' widget '},root:{parent:' window '},rotation:{parent:' canvas frame image scrollbar text '},scrollbar:{parent:' frame text textarea window '},scrolling:{parent:' text '},scrollX:{parent:' frame '},scrollY:{parent:' frame '},secure:{parent:' preference textarea '},shadow:{parent:' about-text about-version text window '},size:{parent:' about-text about-version text textarea '},spellcheck:{parent:' textarea '},src:{parent:' image '},srcHeight:{parent:' image '},srcWidth:{parent:' image '},style:{parent:' about-text about-version canvas frame image preference scrollbar text textarea window '},subviews:{parent:' frame '},superview:{parent:' canvas frame image scrollbar text textarea '},text:{parent:' frame text textarea window '},textarea:{parent:' frame window '},timer:{parent:' widget '},thumbColor:{parent:' scrollbar textarea '},ticking:{parent:' timer '},ticks:{parent:' preference '},tickLabel:{parent:' preference '},tileOrigin:{parent:' image '},title:{parent:' menuItem preference preferenceGroup window '},tooltip:{parent:' image text textarea '},tracking:{parent:' canvas image '},trigger:{parent:' action '},truncation:{parent:' text '},type:{parent:' preference '},url:{parent:' about-box about-text about-version '},useFileIcon:{parent:' image '},vAlign:{parent:' canvas frame image scrollbar text textarea '},value:{parent:' preference scrollbar '},version:{parent:' widget '},visible:{parent:' canvas frame image scrollbar text textarea window '},vLineSize:{parent:' frame '},vOffset:{parent:' about-text about-version canvas frame image scrollbar shadow text textarea window '},vRegistrationPoint:{parent:' canvas frame image scrollbar text '},vScrollBar:{parent:' frame '},width:{parent:' canvas frame image scrollbar text textarea window '},window:{parent:' canvas frame image scrollbar text textarea widget '},wrap:{parent:' text '},zOrder:{parent:' canvas frame image scrollbar text textarea window '}}}};function xmlword(tag){var w=nexttoken.value;if(!nexttoken.identifier){if(nexttoken.id==='<'){if(tag){error("Expected '{a}' and instead saw '{b}'.",token,'&lt;','<');}else{error("Missing '{a}'.",token,'>');}}else if(nexttoken.id==='(end)'){error("Bad structure.");}else{warning("Missing quote.",token);}}
advance();while(nexttoken.id==='-'||nexttoken.id===':'){w+=nexttoken.id;advance();if(!nexttoken.identifier){error("Bad name '{a}'.",nexttoken,w+nexttoken.value);}
w+=nexttoken.value;advance();}
return w;}
function closetag(n){return'</'+n+'>';}
function xml(){var a;var e;var n;var q;var t;var v;xmode='xml';stack=null;for(;;){switch(nexttoken.value){case'<':if(!stack){stack=[];}
advance('<');t=nexttoken;n=xmlword(true);t.name=n;if(!xtype){if(xmltype[n]){xmltype[n].doBegin();n=xtype;e=false;}else{if(option.fragment){xmltype.html.doBegin();stack=[{name:'body'}];e=xmltype[xtype].doTagName(n,'body');}else{error("Unrecognized tag '<{a}>'.",nexttoken,n);}}}else{if(option.cap&&xtype==='html'){n=n.toLowerCase();}
if(stack.length===0){error("What the hell is this?");}
e=xmltype[xtype].doTagName(n,stack[stack.length-1].name);}
t.type=n;for(;;){if(nexttoken.id==='/'){advance('/');e=true;break;}
if(nexttoken.id&&nexttoken.id.substr(0,1)==='>'){break;}
a=xmlword();switch(xmltype[xtype].doAttribute(n,a)){case'script':xmode='string';advance('=');q=nexttoken.id;if(q!=='"'&&q!=="'"){error("Missing quote.");}
xmode=q;wmode=option.white;option.white=false;advance(q);statements();option.white=wmode;if(nexttoken.id!==q){error("Missing close quote on script attribute.");}
xmode='xml';advance(q);break;case'value':advance('=');if(!nexttoken.identifier&&nexttoken.type!=='(string)'&&nexttoken.type!=='(number)'){error("Bad value '{a}'.",nexttoken,nexttoken.value);}
advance();break;case'string':case'href':advance('=');if(nexttoken.type!=='(string)'){error("Bad value '{a}'.",nexttoken,nexttoken.value);}
advance();break;case'define':advance('=');if(nexttoken.type!=='(string)'){error("Bad value '{a}'.",nexttoken,nexttoken.value);}
addlabel(nexttoken.value,'var*');advance();break;default:if(nexttoken.id==='='){advance('=');if(!nexttoken.identifier&&nexttoken.type!=='(string)'&&nexttoken.type!=='(number)'){}
advance();}}}
switch(xmltype[xtype].doIt(n)){case'script':xmode='script';advance('>');indent=nexttoken.from;statements();if(nexttoken.id!=='</'&&nexttoken.id!=='(end)'){warning("Unexpected '{a}'.",nexttoken,nexttoken.id);}
xmode='xml';break;case'special':e=true;n=closetag(t.name);if(!lex.skip(n)){error("Missing '{a}'.",t,n);}
break;default:lex.skip('>');}
if(!e){stack.push(t);}
break;case'</':advance('</');n=xmlword(true);t=stack.pop();if(!t){error("Unexpected '{a}'.",nexttoken,closetag(n));}
if(t.name!==n){error("Expected '{a}' and instead saw '{b}'.",nexttoken,closetag(t.name),closetag(n));}
if(nexttoken.id!=='>'){error("Missing '{a}'.",nexttoken,'>');}
if(stack.length>0){lex.skip('>');}else{advance('>');}
break;case'<!':for(;;){advance();if(nexttoken.id==='>'){break;}
if(nexttoken.id==='<'||nexttoken.id==='(end)'){error("Missing '{a}'.",token,'>');}}
lex.skip('>');break;case'<!--':lex.skip('-->');break;case'<%':lex.skip('%>');break;case'<?':for(;;){advance();if(nexttoken.id==='?>'){break;}
if(nexttoken.id==='<?'||nexttoken.id==='<'||nexttoken.id==='>'||nexttoken.id==='(end)'){error("Missing '{a}'.",token,'?>');}}
lex.skip('?>');break;case'<=':case'<<':case'<<=':error("Missing '{a}'.",nexttoken,'&lt;');break;case'(end)':return;}
if(stack&&stack.length===0){return;}
if(!lex.skip('')){t=stack.pop();if(t.value){error("Missing '{a}'.",t,closetag(t.name));}else{return;}}
advance();}}
type('(number)',idValue);type('(string)',idValue);syntax['(identifier)']={type:'(identifier)',lbp:0,identifier:true,nud:function(){var c;if(option.undef&&!builtin(this.value)&&xmode!=='"'&&xmode!=="'"){c=funlab;while(!c[this.value]){c=c['(context)'];if(!c){warning("Undefined {b} '{a}'.",token,this.value,nexttoken.id==='('?"function":"variable");break;}}}
addlabel(this.value,'global');return this;},led:function(){error("Expected an operator and instead saw '{a}'.",nexttoken,nexttoken.value);}};type('(regex)',function(){return[this.id,this.value,this.flags];});delim('(endline)');delim('(begin)');delim('(end)').reach=true;delim('</').reach=true;delim('<![').reach=true;delim('<%');delim('<?');delim('<!');delim('<!--');delim('%>');delim('?>');delim('(error)').reach=true;delim('}').reach=true;delim(')');delim(']');delim(']]>').reach=true;delim('"').reach=true;delim("'").reach=true;delim(';');delim(':').reach=true;delim(',');reserve('else');reserve('case').reach=true;reserve('catch');reserve('default').reach=true;reserve('finally');reservevar('arguments');reservevar('eval');reservevar('false');reservevar('Infinity');reservevar('NaN');reservevar('null');reservevar('this');reservevar('true');reservevar('undefined');assignop('=','assign',20);assignop('+=','assignadd',20);assignop('-=','assignsub',20);assignop('*=','assignmult',20);assignop('/=','assigndiv',20).nud=function(){warning("A regular expression literal can be confused with '/='.");};assignop('%=','assignmod',20);bitwiseassignop('&=','assignbitand',20);bitwiseassignop('|=','assignbitor',20);bitwiseassignop('^=','assignbitxor',20);bitwiseassignop('<<=','assignshiftleft',20);bitwiseassignop('>>=','assignshiftright',20);bitwiseassignop('>>>=','assignshiftrightunsigned',20);infix('?',function(left){parse(10);advance(':');parse(10);},30);infix('||','or',40);infix('&&','and',50);bitwise('|','bitor',70);bitwise('^','bitxor',80);bitwise('&','bitand',90);relation('==',function(left,right){if(option.eqeqeq){warning("Expected '{a}' and instead saw '{b}'.",this,'===','==');}else if(isPoorRelation(left)){warning("Use '{a}' to compare with '{b}'.",this,'===',left.value);}else if(isPoorRelation(right)){warning("Use '{a}' to compare with '{b}'.",this,'===',right.value);}
return['==',left,right];});relation('===');relation('!=',function(left,right){var t=nexttoken;if(option.eqeqeq){warning("Expected '{a}' and instead saw '{b}'.",this,'!==','!=');}else if(isPoorRelation(left)){warning("Use '{a}' to compare with '{b}'.",this,'!==',left.value);}else if(isPoorRelation(right)){warning("Use '{a}' to compare with '{b}'.",this,'!==',right.value);}
return['!=',left,right];});relation('!==');relation('<');relation('>');relation('<=');relation('>=');bitwise('<<','shiftleft',120);bitwise('>>','shiftright',120);bitwise('>>>','shiftrightunsigned',120);infix('in','in',120);infix('instanceof','instanceof',120);infix('+',function(left){nonadjacent(prevtoken,token);nonadjacent(token,nexttoken);var right=parse(130);if(left&&right&&left.id==='(string)'&&right.id==='(string)'){left.value+=right.value;left.character=right.character;if(option.adsafe&&adsafe.hasOwnProperty(left.value.toLowerCase())){warning("Adsafe restricted word '{a}'.",left,left.value);}
if(jx.test(left.value)){warning("JavaScript URL.",left);}
return left;}
return[this.id,left,right];},130);prefix('+','num');infix('-','sub',130);prefix('-','neg');infix('*','mult',140);infix('/','div',140);infix('%','mod',140);suffix('++','postinc');prefix('++','preinc');syntax['++'].exps=true;suffix('--','postdec');prefix('--','predec');syntax['--'].exps=true;prefix('delete',function(){parse(0);}).exps=true;prefix('~',function(){if(option.bitwise){warning("Unexpected '{a}'.",this,'~');}
parse(150);return this;});prefix('!','not');prefix('typeof','typeof');prefix('new',function(){var c=parse(155),i;if(c){if(c.identifier){c['new']=true;switch(c.value){case'Object':warning("Use the object literal notation {}.",token);break;case'Array':warning("Use the array literal notation [].",token);break;case'Number':case'String':case'Boolean':warning("Do not use the {a} function as a constructor.",token,c.value);break;case'Function':if(!option.evil){warning("The Function constructor is eval.");}
break;default:if(c.id!=='function'){i=c.value.substr(0,1);if(i<'A'||i>'Z'){warning("A constructor name should start with an uppercase letter.",token);}}}}else{if(c.id!=='.'&&c.id!=='['&&c.id!=='('){warning("Bad constructor.",token);}}}else{warning("Weird construction. Delete 'new'.",this);}
adjacent(token,nexttoken);if(nexttoken.id==='('){advance('(');if(nexttoken.id!==')'){for(;;){parse(10);if(nexttoken.id!==','){break;}
advance(',');}}
advance(')');}else{warning("Missing '()' invoking a constructor.");}
return syntax['function'];});syntax['new'].exps=true;infix('.',function(left){adjacent(prevtoken,token);var m=identifier();if(typeof m==='string'){countMember(m);}
if(!option.evil&&left&&left.value==='document'&&(m==='write'||m==='writeln')){warning("document.write can be a form of eval.",left);}
this.left=left;this.right=m;return this;},160);infix('(',function(left){adjacent(prevtoken,token);var n=0;var p=[];if(left&&left.type==='(identifier)'){if(left.value.match(/^[A-Z](.*[a-z].*)?$/)){if(left.value!=='Number'&&left.value!=='String'&&left.value!=='Date'){warning("Missing 'new' prefix when invoking a constructor.",left);}}}
if(nexttoken.id!==')'){for(;;){p[p.length]=parse(10);n+=1;if(nexttoken.id!==','){break;}
advance(',');}}
advance(')');if(typeof left==='object'){if(left.value==='parseInt'&&n===1){warning("Missing radix parameter.",left);}
if(!option.evil){if(left.value==='eval'||left.value==='Function'){warning("eval is evil.",left);}else if(p[0]&&p[0].id==='(string)'&&(left.value==='setTimeout'||left.value==='setInterval')){warning("Implied eval is evil. Pass a function instead of a string.",p[0]);}}
if(!left.identifier&&left.id!=='.'&&left.id!=='['&&left.id!=='('){warning("Bad invocation.",left);}}
return syntax['function'];},155).exps=true;prefix('(',function(){var v=parse(0);advance(')',this);return v;});infix('[',function(left){var e=parse(0),s;if(e&&e.type==='(string)'){countMember(e.value);if(ix.test(e.value)){s=syntax[e.value];if(!s||!s.reserved){warning("['{a}'] is better written in dot notation.",e,e.value);}}}
advance(']',this);this.left=left;this.right=e;return this;},160);prefix('[',function(){if(nexttoken.id===']'){advance(']');return;}
var b=token.line!==nexttoken.line;if(b){indent+=4;}
for(;;){if(b&&token.line!==nexttoken.line){indentation();}
parse(10);if(nexttoken.id===','){adjacent(token,nexttoken);advance(',');if(nexttoken.id===','||nexttoken.id===']'){warning("Extra comma.",token);}
nonadjacent(token,nexttoken);}else{if(b){indent-=4;indentation();}
advance(']',this);return;}}},160);(function(x){x.nud=function(){var i,s;if(nexttoken.id==='}'){advance('}');return;}
var b=token.line!==nexttoken.line;if(b){indent+=4;}
for(;;){if(b){indentation();}
i=optionalidentifier(true);if(!i){if(nexttoken.id==='(string)'){i=nexttoken.value;if(ix.test(i)){s=syntax[i];}
advance();}else if(nexttoken.id==='(number)'){i=nexttoken.value.toString();advance();}else{error("Expected '{a}' and instead saw '{b}'.",nexttoken,'}',nexttoken.value);}}
countMember(i);advance(':');nonadjacent(token,nexttoken);parse(10);if(nexttoken.id===','){adjacent(token,nexttoken);advance(',');if(nexttoken.id===','||nexttoken.id==='}'){warning("Extra comma.",token);}
nonadjacent(token,nexttoken);}else{if(b){indent-=4;indentation();}
advance('}',this);return;}}};x.fud=function(){error("Expected to see a statement and instead saw a block.");};})(delim('{'));function varstatement(){var c,i,n,v;if(inblock){warning("{b} {a} declared in a block.",nexttoken,nexttoken.value,'variable');}
for(;;){nonadjacent(token,nexttoken);n=identifier();addlabel(n,'var');if(nexttoken.id==='='){v=token;nonadjacent(token,nexttoken);advance('=');nonadjacent(token,nexttoken);parse(20);}
if(nexttoken.id!==','){return;}
adjacent(token,nexttoken);advance(',');nonadjacent(token,nexttoken);c=true;}}
stmt('var',varstatement);stmt('new',function(){error("'new' should not be used as a statement.");});function functionparams(){var t=nexttoken;advance('(');if(nexttoken.id===')'){advance(')');return;}
for(;;){addlabel(identifier(),'parameter');if(nexttoken.id===','){advance(',');}else{advance(')',t);return;}}}
blockstmt('function',function(){var i=identifier();if(inblock){warning("{b} {a} declared in a block.",token,i,'function');}
addlabel(i,'var*');beginfunction(i);addlabel(i,'function');adjacent(token,nexttoken);functionparams();block(false);endfunction();if(nexttoken.id==='('&&nexttoken.line===token.line){error("Function statements are not invocable. Wrap the function expression in parens.");}});prefix('function',function(){var i=optionalidentifier();if(i){adjacent(token,nexttoken);}else{nonadjacent(token,nexttoken);i='"'+anonname+'"';}
beginfunction(i);addlabel(i,'function');functionparams();block(false);endfunction();});blockstmt('if',function(){var t=nexttoken;advance('(');nonadjacent(this,t);parse(20);if(nexttoken.id==='='){warning("Assignment in control part.");advance('=');parse(20);}
advance(')',t);block(true);if(nexttoken.id==='else'){nonadjacent(token,nexttoken);advance('else');if(nexttoken.id==='if'||nexttoken.id==='switch'){statement();}else{block(true);}}});blockstmt('try',function(){var b;block(true);if(nexttoken.id==='catch'){advance('catch');beginfunction('"catch"');functionparams();block(true);endfunction();b=true;}
if(nexttoken.id==='finally'){advance('finally');beginfunction('"finally"');block(true);endfunction();return;}else if(!b){error("Expected '{a}' and instead saw '{b}'.",nexttoken,'catch',nexttoken.value);}});blockstmt('while',function(){var t=nexttoken;advance('(');nonadjacent(this,t);parse(20);if(nexttoken.id==='='){warning("Assignment in control part.");advance('=');parse(20);}
advance(')',t);block(true);}).labelled=true;reserve('with');blockstmt('switch',function(){var t=nexttoken;var g=false;advance('(');nonadjacent(this,t);this.condition=parse(20);advance(')',t);nonadjacent(token,nexttoken);t=nexttoken;advance('{');nonadjacent(token,nexttoken);indent+=4;this.cases=[];for(;;){switch(nexttoken.id){case'case':switch(verb){case'break':case'case':case'continue':case'return':case'switch':case'throw':break;default:warning("Expected a 'break' statement before 'case'.",token);}
indentation(-4);advance('case');this.cases.push(parse(20));g=true;advance(':');verb='case';break;case'default':switch(verb){case'break':case'continue':case'return':case'throw':break;default:warning("Expected a 'break' statement before 'default'.",token);}
indentation(-4);advance('default');g=true;advance(':');break;case'}':indent-=4;indentation();advance('}',t);if(this.cases.length===1||this.condition.id==='true'||this.condition.id==='false'){warning("This 'switch' should be an 'if'.",this);}
return;case'(end)':error("Missing '{a}'.",nexttoken,'}');return;default:if(g){switch(token.id){case',':error("Each value should have its own case label.");return;case':':statements();break;default:error("Missing ':' on a case clause.",token);}}else{error("Expected '{a}' and instead saw '{b}'.",nexttoken,'case',nexttoken.value);}}}}).labelled=true;stmt('debugger',function(){if(!option.debug){warning("All 'debugger' statements should be removed.");}});stmt('do',function(){block(true);advance('while');var t=nexttoken;nonadjacent(token,t);advance('(');parse(20);advance(')',t);}).labelled=true;blockstmt('for',function(){var t=nexttoken;advance('(');nonadjacent(this,t);if(peek(nexttoken.id==='var'?1:0).id==='in'){if(nexttoken.id==='var'){advance('var');addlabel(identifier(),'var');}else{advance();}
advance('in');parse(20);advance(')',t);block(true);return;}else{if(nexttoken.id!==';'){if(nexttoken.id==='var'){advance('var');varstatement();}else{for(;;){parse(0);if(nexttoken.id!==','){break;}
advance(',');}}}
advance(';');if(nexttoken.id!==';'){parse(20);}
advance(';');if(nexttoken.id===';'){error("Expected '{a}' and instead saw '{b}'.",nexttoken,')',';');}
if(nexttoken.id!==')'){for(;;){parse(0);if(nexttoken.id!==','){break;}
advance(',');}}
advance(')',t);block(true);}}).labelled=true;function nolinebreak(t){if(t.line!==nexttoken.line){warning("Line breaking error '{a}'.",t,t.id);}}
stmt('break',function(){nolinebreak(this);if(funlab[nexttoken.value]==='live*'){advance();}
reachable('break');});stmt('continue',function(){nolinebreak(this);if(funlab[nexttoken.value]==='live*'){advance();}
reachable('continue');});stmt('return',function(){nolinebreak(this);if(nexttoken.id!==';'&&!nexttoken.reach){nonadjacent(token,nexttoken);parse(20);}
reachable('return');});stmt('throw',function(){nolinebreak(this);nonadjacent(token,nexttoken);parse(20);reachable('throw');});reserve('abstract');reserve('boolean');reserve('byte');reserve('char');reserve('class');reserve('const');reserve('double');reserve('enum');reserve('export');reserve('extends');reserve('final');reserve('float');reserve('goto');reserve('implements');reserve('import');reserve('int');reserve('interface');reserve('long');reserve('native');reserve('package');reserve('private');reserve('protected');reserve('public');reserve('short');reserve('static');reserve('super');reserve('synchronized');reserve('throws');reserve('transient');reserve('void');reserve('volatile');function jsonValue(){function jsonObject(){var t=nexttoken;advance('{');while(nexttoken.id!=='}'){if(nexttoken.id==='(end)'){error("Missing '}' to match '{' from line {a}.",nexttoken,t.line+1);}else if(nexttoken.id!=='(string)'){warning("Expected a string and instead saw {a}.",nexttoken,nexttoken.value);}else{if(nexttoken.quote!=='"'){warning("Expected double quotes and instead saw single quotes.",nexttoken);}}
advance();advance(':');jsonValue();if(nexttoken.id!==','){break;}
advance(',');}
advance('}');}
function jsonArray(){var t=nexttoken;advance('[');while(nexttoken.id!==']'){if(nexttoken.id==='(end)'){error("Missing ']' to match '[' from line {a}.",nexttoken,t.line+1);}
jsonValue();if(nexttoken.id!==','){break;}
advance(',');}
advance(']');}
var id=nexttoken.id;if(id==='{'){jsonObject();}else if(id==='['){jsonArray();}else if(id==='true'||id==='false'||id==='null'||id==='(number)'){advance();}else if(id==='(string)'){if(nexttoken.quote!=='"'){warning("Expected double quotes and instead saw single quotes.",nexttoken);}
advance();}else{error("Expected a JSON value.",nexttoken);}}
var itself=function(s,o){option=o||{};JSLINT.errors=[];globals={};functions=[];xmode=false;xtype='';stack=null;funlab={};member={};funstack=[];lookahead=[];inblock=false;indent=0;warnings=0;lex.init(s);prevtoken=token=nexttoken=syntax['(begin)'];try{advance();if(nexttoken.value.charAt(0)==='<'){xml();}else if(nexttoken.id==='{'||nexttoken.id==='['){jsonValue();}else{statements();}
advance('(end)');}catch(e){if(e){JSLINT.errors.push({reason:"JSLint error: "+e.description,line:nexttoken.line,character:nexttoken.from,evidence:nexttoken.value});}}
return JSLINT.errors.length===0;};itself.report=function(option){var a=[];var c;var cc;var f;var i;var k;var o=[];var s;var v;function detail(h){if(s.length){o.push('<div>'+h+':&nbsp; '+s.sort().join(', ')+'</div>');}}
k=JSLINT.errors.length;if(k){o.push('<div id=errors>Error:<blockquote>');for(i=0;i<k;i+=1){c=JSLINT.errors[i];if(c){o.push('<p>Problem at line '+(c.line+1)+' character '+(c.character+1)+': '+c.reason.entityify()+'</p><p><tt>'+
(c.evidence&&(c.evidence.length>80?c.evidence.substring(0,77)+'...':c.evidence).entityify())+'</tt></p>');}}
o.push('</blockquote></div><br>');if(!c){return o.join('');}}
if(!option){for(k in member){if(typeof member[k]==='number'){a.push(k);}}
if(a.length){a=a.sort();o.push('<table><tbody><tr><th>Members</th><th>Occurrences</th></tr>');for(i=0;i<a.length;i+=1){o.push('<tr><td><tt>',a[i],'</tt></td><td>',member[a[i]],'</td></tr>');}
o.push('</tbody></table>');}
for(i=0;i<functions.length;i+=1){f=functions[i];for(k in f){if(f.hasOwnProperty(k)&&f[k]==='global'){c=f['(context)'];for(;;){cc=c['(context)'];if(!cc){if((!funlab[k]||funlab[k]==='var?')&&!builtin(k)){funlab[k]='var?';f[k]='global?';}
break;}
if(c[k]==='parameter!'||c[k]==='var!'){f[k]='var.';break;}
if(c[k]==='var'||c[k]==='var*'||c[k]==='var!'){f[k]='var.';c[k]='var!';break;}
if(c[k]==='parameter'){f[k]='var.';c[k]='parameter!';break;}
c=cc;}}}}
s=[];for(k in funlab){if(funlab.hasOwnProperty(k)){c=funlab[k];if(typeof c==='string'&&c.substr(0,3)==='var'){if(c==='var?'){s.push('<tt>'+k+'</tt><small>&nbsp;(?)</small>');}else{s.push('<tt>'+k+'</tt>');}}else{if(c==='global'&&!builtin(k)){s.push('<tt>'+k+'</tt><small>&nbsp;(?)</small>');}}}}
detail('Global');if(functions.length){o.push('<br>Function:<ol style="padding-left:0.5in">');}
for(i=0;i<functions.length;i+=1){f=functions[i];o.push('<li value='+
f['(line)']+'><tt>'+(f['(name)']||'')+'</tt>');s=[];for(k in f){if(f.hasOwnProperty(k)&&k.charAt(0)!=='('){switch(f[k]){case'parameter':s.push('<tt>'+k+'</tt>');break;case'parameter!':s.push('<tt>'+k+'</tt><small>&nbsp;(closure)</small>');break;}}}
detail('Parameter');s=[];for(k in f){if(f.hasOwnProperty(k)&&k.charAt(0)!=='('){switch(f[k]){case'var':s.push('<tt>'+k+'</tt><small>&nbsp;(unused)</small>');break;case'var*':s.push('<tt>'+k+'</tt>');break;case'var!':s.push('<tt>'+k+'</tt><small>&nbsp;(closure)</small>');break;case'var.':s.push('<tt>'+k+'</tt><small>&nbsp;(outer)</small>');break;}}}
detail('Var');s=[];c=f['(context)'];for(k in f){v=f[k];if(f.hasOwnProperty(k)&&k.charAt(0)!=='('&&v.substr(0,6)==='global'){if(v==='global?'){s.push('<tt>'+k+'</tt><small>&nbsp;(?)</small>');}else{s.push('<tt>'+k+'</tt>');}}}
detail('Global');s=[];for(k in f){if(f.hasOwnProperty(k)&&k.charAt(0)!=='('&&f[k]==='label'){s.push(k);}}
detail('Label');o.push('</li>');}
if(functions.length){o.push('</ol>');}}
return o.join('');};return itself;}();(function(){var c=document.cookie;var cluster={recommended:['eqeqeq','nomen','undef','white'],goodparts:['bitwise','eqeqeq','nomen','plusplus','undef','white']};var i;var input=document.getElementById('input');var n;var ns;var o;var options=['adsafe','bitwise','browser','cap','debug','eqeqeq','evil','fragment','laxbreak','nomen','passfail','plusplus','rhino','undef','white','widget'];var output=document.getElementById('output');function getOption(o){var n=document.getElementById(o);return n&&n.checked;}
function setOption(o,b){var n=document.getElementById(o);if(n){n.checked=b;}}
function setCluster(n){document.getElementById(n).onclick=function(e){var c=cluster[n];for(i=0;i<options.length;i+=1){setOption(options[i],false);}
for(i=0;i<c.length;i+=1){setOption(c[i],true);}};}
input.onchange=function(e){output.innerHTML='';};ns=document.getElementsByName('jslint');for(i=0;i<ns.length;i+=1){n=ns[i];switch(n.value){case'JSLint':n.onclick=function(e){var b;var d=new Date();var j;var k='{';var oj;var op={};for(j=0;j<options.length;j+=1){oj=options[j];if(getOption(oj)){op[oj]=true;if(b){k+=',';}
k+='"'+oj+'":true';b=true;}}
k+='}';d.setTime(d.getTime()+1e10);document.cookie='jslint='+k+';expires='+
d.toGMTString();JSLINT(input.value,op);output.innerHTML=JSLINT.report();input.select();return false;};break;case'clear':n.onclick=function(e){input.value='';output.innerHTML='';input.select();return false;};break;}}
if(c&&c.length>8){i=c.indexOf('jslint={');if(i>=0){c=c.substring(i+7);i=c.indexOf('}');if(i>1){c=c.substring(0,i+1);o=eval('('+c+')');for(i=0;i<options.length;i+=1){if(o[options[i]]){setOption(options[i],true);}}}}}
setCluster('recommended');setCluster('goodparts');input.select();})();