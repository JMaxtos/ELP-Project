# XQL – A Lightweight XML Query & Transformation Scripting Language

XQL is a simple domain-specific scripting language designed to **load, query, and transform XML documents** into new XML content.  
It is inspired by query languages like XPath/XQuery, but focuses on lightweight **scripting with templates** that is easy to learn and run directly from the command line.

---

## ✨ Features

- **Load & Save XML** – import XML documents and export new XML files.  
- **Variable Assignments** – assign XML nodes or strings to variables.  
- **Querying** – navigate XML with dot (`.`), index (`[n]`), and attribute access.  
- **Operations** – count (`#`), mapping (`->`), and summation (`++`).  
- **Templates** – generate new XML output with embedded variables and loops.  
- **Script Parameters** – pass external arguments (`$1`, `$2`, …) for input/output.  
- **Validation** – runtime and compile-time checks:
  - Missing variables → compilation error.  
  - Non-existent entities/attributes → runtime error.  
  - Wrong operations (e.g., summation on strings) → runtime error.  
  - Wrong number of arguments → runtime error.  

---

## 📄 Example

Given the XML file `uc.xml`:

```xml
<uc-set id="demo">
   <course code="ELP">
     <credits>6</credits>
     <evaluation>
       <item name="test" weight="40"/>
       <item name="project" weight="60"/>
     </evaluation>
   </course>
   <course code="PA">
     <credits>6</credits>
     <evaluation>
       <item name="quizzes" weight="20"/>
       <item name="project" weight="80"/>
     </evaluation>
   </course>
</uc-set>
```
A sample XQL script `demo.xql`:
```xql
load $1 to doc         
setid = doc.id         
courses = doc.course   
elp = doc.course[0]     
pacredits = doc.course[1].credits 
total = doc.course#     
ids = doc.course->code  
credits = doc.course->credits++ 

xml = ***
<summary count="$total" credits="$credits">
  <uc$courses name="$code"/>
</summary>
***

save xml to $2          
```

Running the script, produces `out.xml`:
```xml
<summary count="2" credits="12">
  <uc name="ELP"/>
  <uc name="PA"/>
</summary>
```
