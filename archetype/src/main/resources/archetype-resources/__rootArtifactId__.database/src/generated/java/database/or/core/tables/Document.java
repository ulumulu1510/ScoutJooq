#set( $symbol_dollar = '$' )
#set( $symbol_pound = '#' )
#set( $symbol_escape = '\' )
/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.core.tables;


import ${package}.database.generator.converter.LongConverter;
import ${package}.database.or.core.Core;
import ${package}.database.or.core.Keys;
import ${package}.database.or.core.tables.records.DocumentRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Document extends TableImpl<DocumentRecord> {

    private static final long serialVersionUID = 1545948892;

    /**
     * The reference instance of <code>core.DOCUMENT</code>
     */
    public static final Document DOCUMENT = new Document();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentRecord> getRecordType() {
        return DocumentRecord.class;
    }

    /**
     * The column <code>core.DOCUMENT.ID</code>.
     */
    public final TableField<DocumentRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>core.DOCUMENT.NAME</code>.
     */
    public final TableField<DocumentRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>core.DOCUMENT.TYPE</code>.
     */
    public final TableField<DocumentRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>core.DOCUMENT.SIZE</code>.
     */
    public final TableField<DocumentRecord, BigDecimal> SIZE = createField("SIZE", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>core.DOCUMENT.CONTENT</code>.
     */
    public final TableField<DocumentRecord, byte[]> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>core.DOCUMENT.USER_ID</code>.
     */
    public final TableField<DocumentRecord, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>core.DOCUMENT.UPLOADED</code>.
     */
    public final TableField<DocumentRecord, String> UPLOADED = createField("UPLOADED", org.jooq.impl.SQLDataType.VARCHAR(28), this, "");

    /**
     * The column <code>core.DOCUMENT.ACTIVE</code>.
     */
    public final TableField<DocumentRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>core.DOCUMENT</code> table reference
     */
    public Document() {
        this(DSL.name("DOCUMENT"), null);
    }

    /**
     * Create an aliased <code>core.DOCUMENT</code> table reference
     */
    public Document(String alias) {
        this(DSL.name(alias), DOCUMENT);
    }

    /**
     * Create an aliased <code>core.DOCUMENT</code> table reference
     */
    public Document(Name alias) {
        this(alias, DOCUMENT);
    }

    private Document(Name alias, Table<DocumentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Document(Name alias, Table<DocumentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Core.CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DocumentRecord> getPrimaryKey() {
        return Keys.PK_DOCUMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DocumentRecord>> getKeys() {
        return Arrays.<UniqueKey<DocumentRecord>>asList(Keys.PK_DOCUMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Document as(String alias) {
        return new Document(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Document as(Name alias) {
        return new Document(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Document rename(String name) {
        return new Document(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Document rename(Name name) {
        return new Document(name, null);
    }
}
