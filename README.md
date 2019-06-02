org.apache.ibatis.session.Configuration
		addMappers->
org.apache.ibatis.binding.MapperRegistry
		addMappers->
		addMapper->
org.apache.ibatis.builder.annotation.MapperAnnotationBuilder
		parse()->
org.apache.ibatis.builder.annotation.MapperAnnotationBuilder
		loadXmlResource->
org.apache.ibatis.builder.xml.XMLMapperBuilder
		parse()->
		bindMapperForNamespace->
org.apache.ibatis.session.Configuration.
		addMapper->
org.apache.ibatis.binding.MapperRegistry.
		addMapper->
org.apache.ibatis.builder.annotation.MapperAnnotationBuilder. ***************
		parse
		parseStatement->
		getSqlSourceFromAnnotations
ProviderSqlSource
+++++++++++++++++++++++++++
MapperAnnotationBuilder->sqlProviderAnnotationTypes->getSqlProviderAnnotationType->getSqlSourceFromAnnotations->addMappedStatement	->MappedStatement.Builder

++++++++++++++++++++++++++++++++++++++++++
method.getAnnotation(ymy.com.mybatis.demo.annotation.SqlByMethod.class)
method.getAnnotation(org.apache.ibatis.annotations.SelectProvider.class)

build 468
+++++++++++++++++++++++++++
https://www.cnblogs.com/xuyuanjia/p/5795621.html